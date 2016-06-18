// 1.1.14 Write a static method lg() that takes an int value N as argument and returns
// the largest int not larger than the base-2 logarithm of N. Do not use Math.

package edu.princeton.cs.algs4;
public class Ex_1_1_14 {

    public static int lg(int N){
        int i=0;
        while (N>0) {
            N=N/2;
            i=i+1;
        }
        return i-1;
    }

    public static void main(String[] args) {
        //StdOut.printf("%d",Integer.parseInt("50"));
        //int j=Integer.parseInt(args[0]);
        //StdOut.printf("%d",j);
        StdOut.printf("%d",Ex_1_1_14.lg(Integer.parseInt(args[0])));
        // for (int i = 0; i < 65; i++) {
        //     StdOut.printf("%d",Ex_1_1_14.lg(Integer.parseInt(args[0])+i));
        // }

    }
}
