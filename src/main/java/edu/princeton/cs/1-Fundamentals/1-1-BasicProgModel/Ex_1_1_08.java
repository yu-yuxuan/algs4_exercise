// 1.1.8 What do each of the following print?

//                   a. System.out.println('b');
// b. System.out.println('b' + 'c');
// c. System.out.println((char) ('a' + 4));
// Explain each outcome.
package edu.princeton.cs.algs4;
public class Ex_1_1_08 {
    public static void main(String[] args) {
        StdOut.println('b');
        StdOut.println('b' + 'c');
        StdOut.println("b" + "c");
        StdOut.println('b' + 4);
        StdOut.println("b" + 4);
        StdOut.println((char) ('a' + 4));
    }
}
