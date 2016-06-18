// 1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean
// array, using * to represent true and a space to represent false. Include row and column
//     numbers.
package edu.princeton.cs.algs4;
//import java.util.Arrays;

public class Ex_1_1_11 {
    /**
     *
     public static int indexOf(int[] a, int key) {
     *
     */
    private Ex_1_1_11() { }
    public static void showString(boolean[][] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s=a[i][j]?"*":" ";
                StdOut.printf("row %d column %d with %s\n",i,j,s);
            }
        }
    }
    public static void main(String[] args) {
        boolean[][] a;
        int N=3;
        a=new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j]=true;
            }
        }
        a[1][1]=false;
        a[0][1]=false;
        a[0][0]=false;
        Ex_1_1_11.showString(a);
    }
}
