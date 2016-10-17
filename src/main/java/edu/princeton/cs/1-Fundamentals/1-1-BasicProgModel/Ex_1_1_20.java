// Write a recursive static method that computes the value of ln (N !).
package edu.princeton.cs.algs4;
public class Ex_1_1_20 {
    public static int Factorial(int N){
        if (N==1) {
            return 1;
        }
        return N*Factorial(N-1);
    }

    public static void main(String[] args) {
        //StdOut.printf("%d", Factorial(6));
        StdOut.printf("%.6f", Math.log(Factorial(6)));
    }
}
