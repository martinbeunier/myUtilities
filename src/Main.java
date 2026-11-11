public class Main{
    public static void main(String[] args) {

        double[][] myNumbers = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };//
        double[][] mask = { {1, 2}, {3, 4},{5,6}};//
        double[][] mask2 = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };//

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



    }

}