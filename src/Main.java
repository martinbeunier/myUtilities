public class Main{
    public static void main(String[] args) {

        double[][] myNumbers = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };//
        double[][] mask = { {1, 2}, {3, 4},{5,6}};//
        double[][] mask2 = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };//
        double[][] mask3 = { {1, 2}, {3, 4}};//


        System.out.println(Matrix.getColumnsCount(mask)+" "+Matrix.getRowsCount(mask));
        Matrix.printMatrix(myNumbers);
        System.out.println();
        Matrix.printMatrix(mask);



        System.out.println();
        Matrix.printMatrix(Matrix.multiply(myNumbers,mask));
        System.out.println();
        Matrix.printMatrix(Matrix.add(myNumbers,mask2));
        System.out.println();
        Matrix.printMatrix(Matrix.transposition(mask));
        System.out.println();
        Matrix.printMatrix(Matrix.multiply(mask,3));


        System.out.println(Matrix.determinant(myNumbers));

        System.out.println(Matrix.determinant(mask3));

        System.out.println();

        double[] vector = {1,2,3};
        double[] vector2 = {1,2};
        //{1, 2}, {3, 4},{5,6}};
        Matrix.printMatrix(Matrix.multiplyVA(mask,vector));
       // Matrix.printMatrix(Matrix.multiplyAV(mask,vector));
       // Matrix.printMatrix(Matrix.multiplyVA(mask,vector2));
        Matrix.printMatrix(Matrix.multiplyAV(mask,vector2));

        System.out.println(Utilities.factorial(5));
        System.out.println(Useless.fibonaci(10));

     Matrix.printMatrix(Matrix.power(myNumbers,300));

        System.out.println(   Math.pow(2.0,Double.POSITIVE_INFINITY) );
    }

}