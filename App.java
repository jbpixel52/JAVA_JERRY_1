public class App {
    //boo!
    public static void main(String[] args) throws Exception {
        int[] numeros = { 1, 3, 4, 5, 8, 8, 8, 8, 8, 9, 10, 11, 11, 11, 22, 42, 44, 53, 55, 62, 63, 63, 63, 63, 63, 63,
                69, 71, 81, 98, 99, 101, 169 };
        // System.out.println(search(numeros, 69));
        mode(numeros, 1, 0);
    }

    public static int search(int[] array, int toBeSearched) {
        int answer = 0, counter = 0;
        for (int i : array) {
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

    public static void mode(int[] array, int initCounter, int initIndex) {
        int counter = initCounter;
        int i = initIndex;
        for (int j = 0; j < array.length - 2; j++) {
            if ((array[j] == array[j + 1])) {
                counter += 1;
            } else {
                System.out.println(j + " x" + counter);
                counter = 1;
            }
        }
    }
}
