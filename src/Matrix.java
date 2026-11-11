public class Matrix {

    //region basic methods
    public static int getColumnsCount(double[][] matrix){
        return matrix[0].length;
    }
    public static int getRowsCount(double[][] matrix){
        return matrix.length;
    }

public static double[][]copyMatrix(double[][] matrix) {
    double[][] export = new double[getRowsCount(matrix)][getColumnsCount(matrix)]  ;
    for (int row = 0; row < getRowsCount(matrix) ; row++) {
        for (int col = 0; col < getColumnsCount(matrix) ; col++) {
            export[row][col] = matrix[row][col];
        }

    }



        return export;
}

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < getRowsCount(matrix) ; row++) {
            for (int col = 0; col < getColumnsCount(matrix) ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }
//endregion

//region matrix matrix

    public static double[][]multiply(double[][] a ,double[][] b){

        if (getColumnsCount(a) != getRowsCount(b)) {
            throw new IllegalArgumentException("Bad sizes of matrices");
        }


        double[][] export = new double[getRowsCount(a)][getColumnsCount(b)]  ;

        for (int row = 0; row < getRowsCount(a) ; row++) {
            for (int col = 0; col < getColumnsCount(b) ; col++) {


                for (int i = 0; i < getColumnsCount(a); i++) {
                    export[row][col] = export[row][col] + a[row][i] * b[i][col];
                }

            }
        }
        return export;
    }

    public static double[][]add(double[][] a ,double[][] b){


        if (getRowsCount(a) != getRowsCount(b) || getColumnsCount(a) != getColumnsCount(b)) {
            throw new IllegalArgumentException("Bad sizes of matrices");
        }

        double[][] export = copyMatrix(a) ;

        for (int row = 0; row < getRowsCount(a) ; row++) {
            for (int col = 0; col < getColumnsCount(b) ; col++) {

                export[row][col] = a[row][col] + b[row][col];

            }
        }
        return export;
    }

    public static double[][]subtract(double[][] a ,double[][] b){


        if (getRowsCount(a) != getRowsCount(b) || getColumnsCount(a) != getColumnsCount(b)){
            throw new IllegalArgumentException("Bad sizes of matrices");
        }

        double[][] export = copyMatrix(a) ;

        for (int row = 0; row < getRowsCount(a) ; row++) {
            for (int col = 0; col < getColumnsCount(b) ; col++) {

                export[row][col] = a[row][col] - b[row][col];

            }
        }
        return export;
    }

    //endregion
    //region matrix scalar

    public static double[][] divide(double[][] matrix, double number) {

        if (number == 0) {
            throw new ArithmeticException("Division by zero");
        }

        double[][] export = copyMatrix(matrix);

        for (int row = 0; row < getRowsCount(matrix); row++) {
            for (int col = 0; col < getColumnsCount(matrix); col++) {
                export[row][col] = matrix[row][col] / number;
            }
        }

        return export;
    }



    public static double[][]multiply( double[][] matrix,double number ){


      double[][] export = copyMatrix(matrix) ;

        for (int row = 0; row < getRowsCount(matrix) ; row++) {
            for (int col = 0; col < getColumnsCount(matrix) ; col++) {

                export[row][col] = matrix[row][col] * number;

            }
        }
        return export;
    }



    //endregion
    //region matrix vector


    //endregion



    public static double[][] transposition (double[][] matrix){

        double[][] export = new double[getColumnsCount(matrix)][  getRowsCount(matrix)]  ;

        for (int row = 0; row < getRowsCount(matrix) ; row++) {
            for (int col = 0; col < getColumnsCount(matrix) ; col++) {
              export[col][row] =  matrix[row][col];
            }

        }

        return export;



    }
    //region determinant parts
    private static double  determinant22(double[][] matrix){
        return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
    }

    private static double  determinant33(double[][] matrix){
        return  matrix[0][0] * matrix[1][1] * matrix[2][2] +
                matrix[1][0] * matrix[2][1] * matrix[0][2] +
                matrix[2][0] * matrix[0][1] * matrix[1][2] -
                matrix[0][0] * matrix[1][2] * matrix[2][1] -
                matrix[0][1] * matrix[1][0] * matrix[2][2] -
                matrix[0][2] * matrix[1][1] * matrix[2][0] ;
    }

    public static double determinant (double[][] matrix){

        if (getColumnsCount(matrix) != getRowsCount(matrix)) {
            throw new IllegalArgumentException("Bad sizes of matrix");
        }
        if(getColumnsCount(matrix) == 2){return determinant22(matrix);}
        if(getColumnsCount(matrix) == 3){return determinant33(matrix);}
        if(getColumnsCount(matrix) == 4){
            System.out.println("i do no");;return 0;}



        return 0;
    }
    //endregion


    //endregion

    public static double[][] inversion(double[][] matrix){return matrix;}


}
