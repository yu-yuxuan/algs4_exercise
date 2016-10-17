// 1.1.5 Write a code fragment that prints true if the double variables x and y are both
// strictly between 0 and 1 and false otherwise.
package edu.princeton.cs.algs4;
public class Ex_1_1_05 {
    public static void main(String[] args) {
        //int N0=Integer.parseInt(args[0]);
        double N0=Double.parseDouble(args[0]);
        double N1=Double.parseDouble(args[1]);
        if ((N0>=0&&N0<=1)&&(N1>=0&&N1<=1)) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }

    }
}
