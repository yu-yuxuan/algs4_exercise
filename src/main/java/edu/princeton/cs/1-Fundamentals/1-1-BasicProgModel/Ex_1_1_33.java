// Matrix library. Write a library Matrix that implements the following API:
//     public class Matrix
//     static double dot(double[] x, double[] y) vector dot product
//     static double[][] mult(double[][] a, double[][] b) matrix-matrix product
//     static double[][] transpose(double[][] a) transpose
//     static double[] mult(double[][] a, double[] x) matrix-vector product
//     static double[] mult(double[] y, double[][] a) vector-matrix product
// Develop a test client that reads values from standard input and tests all the methods.




//will be rename to Matrix
package edu.princeton.cs.algs4;
public class Ex_1_1_33 {
    public static double dot(double[] x, double[] y){ //vector dot product
        double Sum=0;
        for (int i = 0; i < x.length; i++) {
            Sum+=x[i]*y[i];
        }
        return Sum;
        // try {
        //     if (x.length!=y.length) {
        //         throw new JMSException("Not equal length");
        //     }
        //     double Sum=0;
        //     for (int i = 0; i < x.length; i++) {
        //         Sum+=x[i]*y[i];
        //     }
        //     return Sum;
        // }
        // catch (JMSException e) {
        //     logger.severe("JMS Error: " + e);
        //     //You need to throw exception here or return something
        //     //better would be throw new Exception("JMS Error: " + e);
        // }
    }
        // catch (Throwable e) {
        //     System.out.println("Error " + e.getMessage());
        //     //e.printStackTrace();

        //     //return 0;
        // }
        // return null;

    public static double[][] mult(double[][] a, double[][] b){// matrix-matrix product
        double[][] Sum=new double[a.length][b[0].length];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                for (int k = 0; k < b[0].length; k++) {
                    Sum[i][k]+=a[i][j]*b[j][k];
                }
            }
        }
        return Sum;
    }
    //     try {
    //         if (a[0].length!=b.length) {
    //             throw new Throwable("don't know");
    //         }

    //         double[][] Sum=new double[a.length][b[0].length];
    //         for (int j = 0; j < a[0].length; j++) {
    //             for (int i = 0; i < a.length; i++) {
    //                 for (int k = 0; k < b[0].length; k++) {
    //                     Sum[i][k]+=a[i][j]*b[j][k];
    //                 }
    //             }
    //         }
    //         return Sum;
    //     }
    //     catch (Throwable e) {
    //         System.out.println("Error " + e.getMessage());
    //         e.printStackTrace();
    //     }
    // }
    public static double[][] transpose(double[][] a){// transpose
            double[][] Trans= new double[a[0].length][a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    Trans[j][i]=a[i][j];
                }
            }
            return Trans;
    //     try {
    //         if (a.length*a[0].length==0) {
    //             throw new Throwable("don't know");
    //         }
    //         double[][] Trans= new double[a.length][a[0].length];
    //         for (int i = 0; i < a.length; i++) {
    //             for (int j = 0; j < a[0].length; j++) {
    //                 Trans[j][i]=a[i][j];
    //             }
    //         }
    //     }
    //     catch (Throwable e) {
    //         System.out.println("Error " + e.getMessage());
    //         e.printStackTrace();
    //     }

    }
    public static double[] mult(double[][] a, double[] x){// matrix-vector product
        double[] Sum=new double[a.length];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                Sum[i]+=a[i][j]*x[j];
            }
        }
        return Sum;
    }
    public static double[] mult(double[] y, double[][] a) {//vector-matrix product
        double[] Sum=new double[a[0].length];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[0].length; i++) {
                Sum[i]+=y[j]*a[j][i];
            }
        }
        return Sum;
    }
    public static void main(String[] args) {
        double[] a_1={1,2,3,4};
        double[] b_1={1,2,3,4};
        StdOut.printf("Dot product %.5f",dot(a_1,b_1));
        StdOut.println();
        double[][] a_2={{1,2,3,4},{5,6,7,8}};
        double[][] b_2=transpose(a_2);

        double[][] c_2=mult(a_2,b_2);
        StdOut.println("multi product with transpose");
        for (int i = 0; i < a_2.length; i++) {
            for (int j = 0; j < b_2[1].length; j++) {
                StdOut.printf("%.5f ",c_2[i][j]);
            }
            StdOut.println();
        }
        double[] c_3=mult(a_2,a_1);
        StdOut.println("matrix-vector product");
        for (int i = 0; i < a_2.length; i++) {
            StdOut.printf("%.5f ",c_3[i]);
        }
        StdOut.println();
        double[] c_4=mult(a_1,transpose(a_2));
        StdOut.println("vector-matrix product");
        for (int i = 0; i < a_2.length; i++) {
            StdOut.printf("%.5f ",c_4[i]);
        }
        StdOut.println();

    }
}
