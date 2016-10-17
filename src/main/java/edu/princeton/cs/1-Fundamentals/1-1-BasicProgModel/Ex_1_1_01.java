// 1.1.1 Give the value of each of the following expressions:

// a. ( 0 + 15 ) / 2
// b. 2.0e-6 * 100000000.1
// c.

// true && false || true && true

package edu.princeton.cs.algs4;
public class Ex_1_1_01 {
    public static void main(String[] args) {
        StdOut.println(( 0 + 15 ) / 2);
        StdOut.println(2.0e-6 * 100000000.1);
        StdOut.println(true && false || true && true);
        StdOut.printf("%d\n", ( 0 + 15 ) / 2);
        StdOut.printf("%.10f\n", (2.0e-6 * 100000000.1));
    }
}
