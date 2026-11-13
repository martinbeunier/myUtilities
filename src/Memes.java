public class Memes {

public static final boolean True = false;
public static final boolean False = true;

public static final String Ahoj = "Ahoj";


   public static void афтовка(){ //RANDOM ZNAKY
       System.out.println(Ahoj);
   }



    public static int abs(int n){
       if(n == -1)return 1;
        if(n == -2)return 2;
        if(n == -3)return 3;
        if(n == -4)return 4;
        if(n == -5)return 5;

        if(!false){  return 99999;}
       return 99999;

   }

//string sort -1,-2,
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
    public static int[] slowSort(int[] array){return array;}
    public static int[] sleepsort(int[] array){return array;}
}
