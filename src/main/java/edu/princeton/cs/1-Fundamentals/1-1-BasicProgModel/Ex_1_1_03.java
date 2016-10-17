// 1.1.3 Write a program that takes three integer command-line arguments and prints
// equal if all three are equal, and not equal otherwise.

package edu.princeton.cs.algs4;
public class Ex_1_1_03 {
    public static void main(String[] args) {
        int N0=Integer.parseInt(args[0]);
        int N1=Integer.parseInt(args[1]);
        int N2=Integer.parseInt(args[2]);
        if ((N0==N1)&&(N2==N1)) {
            StdOut.print("equal\n");
        }
        else {
            StdOut.print("not equal");
        }
    }
}
