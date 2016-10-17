// 1.1.9 Write a code fragment that puts the binary representation of a positive integer N
// into a String s.

// Solution: Java has a built-in method Integer.toBinaryString(N) for this job, but
//     the point of the exercise is to see how such a method might be implemented. Here is a
//     particularly concise solution:
//     String s = "";
// for (int n = N; n > 0; n /= 2)
//     s = (n % 2) + s;

package edu.princeton.cs.algs4;
public class Ex_1_1_09 {
    public static void main(String[] args) {
        int N=60;
        StdOut.println(Integer.toBinaryString(N));
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        StdOut.print(s);
    }
}
