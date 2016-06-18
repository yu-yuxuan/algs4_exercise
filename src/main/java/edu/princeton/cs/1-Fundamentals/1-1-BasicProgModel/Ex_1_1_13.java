// 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
// of a two-dimensional array with M rows and N columns.
// double[] a; creation
// a = new double[N];
// for (int i = 0; i < N; i++)
//     a[i] = 0.0;


package edu.princeton.cs.algs4;
public class Ex_1_1_13 {
    public static void Transposition(double[][] a){
        double[][] b;
        b=new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.printf("%.4f ",a[i][j]);
                b[j][i]=a[i][j];
            }
            StdOut.println();
        }
        StdOut.println("#######");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                StdOut.printf("%.4f ",b[i][j]);
            }
            StdOut.println();
        }
    }
    public static void main(String[] args) {
        double[][] a = {{0,1,1},{1,4,2},{12,15,14},{23,24,21}};
        Ex_1_1_13.Transposition(a);
    }
}
