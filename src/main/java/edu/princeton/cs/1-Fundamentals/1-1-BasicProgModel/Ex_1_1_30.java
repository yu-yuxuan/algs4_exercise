// Array exercise. Write a code fragment that creates an N-by-N boolean array
// a[][] such that a[i][j] is true if i and j are relatively prime (have no common factors), and false otherwise.
package edu.princeton.cs.algs4;
public class Ex_1_1_30 {

    public static int gcd(int p, int q)
        {
            if (q == 0) return p;
            int r = p % q;
            return gcd(q, r);

        }
    public static void main(String[] args) {
        int N=9;
        boolean[][] Prime=new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i*j==0||i==1||j==1) {
                    Prime[i][j]=false;
                }
                else if (gcd(i,j)>1) {
                    Prime[i][j]=false;
                } else {
                    Prime[i][j]=true;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%s ",Prime[i][j]);
            }
            StdOut.println();
        }
    }
}
