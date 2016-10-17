// 1.1.26 Sorting three numbers. Suppose that the variables a, b, c, and t are all of the
//     same numeric primitive type. Show that the following code puts a, b, and c in ascending
//     order:
//     if (a > b) { t = a; a = b; b = t; }
// if (a > c) { t = a; a = c; c = t; }
// if (b > c) { t = b; b = c; c = t; }
package edu.princeton.cs.algs4;
public class Ex_1_1_26 {
    public static void main(String[] args) {
        int a,b,c,t;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if (a > b) { t = a; a = b; b = t; }
        StdOut.printf("#%d#%d#%d#\n", a,b,c);
        if (a > c) { t = a; a = c; c = t; }
        StdOut.printf("#%d#%d#%d#\n", a,b,c);
        if (b > c) { t = b; b = c; c = t; }
        StdOut.printf("#%d#%d#%d#\n", a,b,c);

    }
}
