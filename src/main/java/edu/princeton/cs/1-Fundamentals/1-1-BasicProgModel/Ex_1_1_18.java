// 1.1.18 Consider the following recursive function:
// public static int mystery(int a, int b)
// {
//     if (b == 0)
//         return 0;
//     if (b % 2 == 0) return mystery(a+a, b/2);
//     return mystery(a+a, b/2) + a;
// }

// What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers
//     a and b, describe what value mystery(a, b) computes. Answer the same question, but
//     replace the three + operators with * and replace return 0 with return 1.
package edu.princeton.cs.algs4;
public class Ex_1_1_18 {
    public static int mystery(int a, int b)
        {
            if (b == 0)
                return 0;
            if (b % 2 == 0) return mystery(a+a, b/2);
            return mystery(a+a, b/2) + a;
        }
    public static int mystery2(int a, int b)
        {
            if (b == 0)
                return 1;
            if (b % 2 == 0) return mystery2(a*a, b/2);
            return mystery2(a*a, b/2) * a;
        }
    public static void main(String[] args) {
        StdOut.printf("%d",mystery(2, 25));
        StdOut.println();
        StdOut.printf("%d",mystery(3, 11));
        StdOut.println("#####");
        StdOut.printf("%d",mystery2(2, 25));
        StdOut.println();
        StdOut.printf("%d",mystery2(3, 11));
        StdOut.println();
    }
}
//Maybe because 3*11=3*(1+2+8); related to Binary number
//3^11=3^(1+2+8)=3^1*3^2...
