// 1.1.7 Give the value printed by each of the following code fragments:

// a.

// double t = 9.0;
// while (Math.abs(t - 9.0/t) > .001)
//     t = (9.0/t + t) / 2.0;
// StdOut.printf("%.5f\n", t);

// b.

// int sum = 0;
// for (int i = 1; i < 1000; i++)
//     for (int j = 0; j < i; j++)
//         sum++;
// StdOut.println(sum);

// c.

// int sum = 0;
// for (int i = 1; i < 1000; i *= 2)
//     for (int j = 0; j < 1000; j++)
//         sum++;
// StdOut.println(sum);

package edu.princeton.cs.algs4;
public class Ex_1_1_07 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
    }
}
