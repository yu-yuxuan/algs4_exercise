// 1.1.17 Criticize the following recursive function:

// Answer : The base case will never be reached. A call to exR2(3) will result in calls to
//     exR2(0), exR2(-3), exR3(-6), and so forth until a StackOverflowError occurs.

package edu.princeton.cs.algs4;
public class Ex_1_1_17 {
    public static String exR2(int n)
        {
            //String s = exR2(n-3) + n + exR2(n-2) + n;
            if (n <= 0) return "";
            String s = exR2(n-3) + n + exR2(n-2) + n;
            return s;
        }

    public static void main(String[] args) {
        StdOut.println(exR2(6));
   }
}
