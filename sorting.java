import java.util.Date;

public class sorting {

    public static void main(String[] args) {
        final int[] numeros = { 1,4,2,5,6,3,9 };
        final int[] numerotes = { 55, 44, 66, 99, 33, 11 };
        System.out.println();
        printer(numeros);
        final long start = System.nanoTime();
        bubble(numeros);
        final long stop = System.nanoTime() - start;
        System.out.println("Execution time in Miliseconds:" + (stop / 1000000));
        printer(numerotes);
        modifiedBubble(numerotes);

        sleepSort(numeros);

    }

    public static void bubble(int[] array) {
        System.out.println("\nbubble sort");
        int[] clone = array;
        int len = clone.length;
        int bubble = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (clone[j] > clone[j + 1]) {
                    bubble = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = bubble;
                }
            }
        }
        printer(clone);
        System.out.println("\n-------------");
    }

    public static void printer(int[] array) {
        for (int i : array)
            System.out.printf(i + " ");
    }

    public static void modifiedBubble(int[] array) {
        System.out.println("\nModified bubble sort");
        int[] clone = array;
        int len = clone.length;
        int bubble = 0;
        int flags = 1;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (clone[j] > clone[j + 1]) {
                    bubble = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = bubble;

                } else
                    flags++;
                if (flags == len) {
                    break;
                }

            }
        }
        printer(clone);
        System.out.println("\n-------------");
    }

    public static void sleepSort(int[] array) {
        int[] sorted = new int[array.length];
        Date startT = new Date();
        int index = 0;
        int loop = 0;
        do {

            for (int i= loop; i<array.length; i++ ) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                Date endT = new Date();
                long seconds = (endT.getTime() - startT.getTime()) / 1000;
                int IntSeconds = (int) seconds;

                if (IntSeconds == i) {
                    sorted[index] = array[i];
                    index++;
                }

                System.out.println(IntSeconds);
                printer(sorted);
                System.out.println("");

            }
            loop++;
        } while (index != array.length);
    }
}
