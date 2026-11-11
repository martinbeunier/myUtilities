public class Memes {
    public static int[] stalinSort(int[] array){

        int max = array[0];

        int[] temp = new int[array.length];
        int newSize = 0;

        temp[0] = max;
        newSize ++  ;

        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {

                max = array[i];
                temp[newSize] = max;
                newSize ++;

            }

        }

        int[] export = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            export[i] = temp[i];
        }


        return export;
    }
    public static int[] thanosSort(int[] array){return array;}

}
