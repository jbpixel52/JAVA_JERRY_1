public class App {
    // boo!
    public static void main(String[] args) throws Exception {
        int[] numeros = { 1,1,1,1,2,2,3,3,3,3,3,3,3,5,5,5,5,5,5,10,11,12,12,12};
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

    public static void mode(int[] array, int initCounter, int initIndex) {
        int counter = initCounter;
        int contra = 1;
        int i = initIndex;

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
