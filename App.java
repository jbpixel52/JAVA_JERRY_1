import java.util.*;

public class App {
    public static void main(final String[] args) throws Exception {
        final int[] numeros = { 8, 8, 8, 8, 8, 9, 9, 10, 11, 11, 11, 11, 11, 11, 11, 11, 22, 42, 44, 53, 55, 64, 69, 71,
                81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 82, 98, 99, 101, 169 };
        System.out.println(search(numeros, 69));
        mode(numeros);
    }

    public static int search(final int[] array, final int toBeSearched) {
        int answer = 0, counter = 0;
        for (final int i : array) {
            counter += 1;
            if (i == toBeSearched) {
                System.out.println(toBeSearched + " at " + counter);
                answer = 1;
                break;
            }
        }
        answer = (counter == array.length) ? -1 : 1;
        return answer;
    }

    public static void mode(final int[] array) throws Exception {
        int prime = 0;
        int sec = 0;
        int primeCounter = 1;
        int secCounter = 1;
        int relay = -1;
        // List<Integer> modas = new ArrayList<Integer>();
        for (int i = 0; i < array.length - 2; i++) {
            prime = (primeCounter < secCounter) ? sec : prime;
            if (secCounter > primeCounter) {
                prime = sec;
                primeCounter = secCounter;
                relay *= -1;
                secCounter = 1;
            }

            switch (relay) {
                case 1:
                    if (array[i] == array[i + 1]) {
                        prime = array[i];
                        primeCounter++;
                    } else
                        relay = -1;
                    break;
                case -1:
                    if (array[i] == array[i + 1]) {
                        sec = array[i];
                        secCounter++;
                    } else
                        relay = 1;
                    break;
                default:
                    throw new Exception("OOPS!");

            }

        }

        System.out.println("MODA: " + prime + " VECES " + primeCounter);

    }
}