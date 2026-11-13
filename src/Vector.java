public class Vector {
    //region vector vector
    public static double multiply(double[] v ,double[] u) { // dot product
        if (v.length != u.length) {
            throw new IllegalArgumentException("Bad sizes of vectors");
        }

        double sum = 0;

        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i]*u[i];
        }
        return sum;
    }

    public static double[] add(double[] v ,double[] u) {
        if (v.length != u.length) {
            throw new IllegalArgumentException("Bad sizes of vectors");
        }
        double[] export = new double[v.length];



        for (int i = 0; i < v.length; i++) {
            export[i] = v[i] +u[i];
        }
        return export;
    }

    public static double[] subtract(double[] v ,double[] u) {
        if (v.length != u.length) {
            throw new IllegalArgumentException("Bad sizes of vectors");
        }
        double[] export = new double[v.length];



        for (int i = 0; i < v.length; i++) {
            export[i] = v[i] -u[i];
        }
        return export;
    }

    //endregion
    //region scalar vector
    public static double[] multiply(double[] v ,double k) {
        double[] export = new double[v.length];



        for (int i = 0; i < v.length; i++) {
            export[i]  =k* v[i] ;
        }
        return export;
    }
    //endregion
    public static double norm(double[] v) { //  ||v||  Eukleid
        return Math.sqrt(   multiply(v,v));
    }

    public static double largeness(double[] v) { //  |v||
        return    multiply(v,v);
    }


}
