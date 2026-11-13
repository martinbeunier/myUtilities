public class Useless {

    public static int fibonaci(int n){


        if(n == 0){return 0;}
        if(n == 1){return 1;}


        if(n>1)         {
            return fibonaci(n - 1) + fibonaci(n-2);
        }
        return 1;




    }
}
