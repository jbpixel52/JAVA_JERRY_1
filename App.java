import java.util.*;

public class App {
    // boo!
    public static void main(String[] args) throws Exception {
        int[] numeros = { 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 10, 11, 12, 12, 12 };
        // System.out.println(search(numeros, 69));
        mode(numeros, 1, 0);
    }

    public static int search(int[] array, int toBeSearched) {
        int answer = 0, counter = 0;
        for (int i : array) {
            counter += 1;
            if (i == toBeSearched) {
                System.out.println(toBeSearched + " at " + counter);
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

        for (int j = i; j < array.length; j++) {
            if (array[j] == array[j+1]) {
                counter++;
                
            }
            if(j>0 && array[j] != array[j-1]){
                //aqui es cuando termina la repeticion

                System.out.println(array[j]);
            }
        }
    }
 }
}
 
}