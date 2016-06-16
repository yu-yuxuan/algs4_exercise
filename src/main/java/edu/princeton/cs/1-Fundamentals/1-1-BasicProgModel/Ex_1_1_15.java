package edu.princeton.cs.algs4;
public class Ex_1_1_15 {
    public static void main(String[] args) {
        int c=10;
        int a=6;
        int b=4;
        if (a > b) { c = 0; }
        StdOut.printf("%d\n", c);
        if (a > b) c = 1;
        StdOut.printf("%d\n", c);
        if (a > b) c = 2; else b = 0;
        StdOut.printf("%d###%d\n", c,b);

    }
}
