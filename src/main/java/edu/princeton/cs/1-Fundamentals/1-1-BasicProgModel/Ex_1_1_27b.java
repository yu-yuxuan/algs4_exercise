// 1.1.27b Binomial distribution. Estimate the number of recursive calls that would be
// used by the code
// public static double binomial(int N, int k, double p)
// {
//     if ((N == 0) && (k == 0)) return 1.0;
//     if ((N < 0) || (k < 0)) return 0.0;
//     return (1 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
// }

// to compute binomial(100, 50, 0.25). Develop a better implementation that is based
//     on saving computed values in an array.

// 000000000000000000000000000000000000000000000000000000000
// 000000000000000000000000000000000000000000000000000000000
// 000000000000000000000001
// 00000000000000000000001 1
// 0000000000000000000001   1
// 000000000000000000001     1
// 00000000000000000001       1
// 0000000000000000001         1
// 000000000000000001           1
// 00000000000000001-------------1



package edu.princeton.cs.algs4;
public class Ex_1_1_27b {
    public static double binomial(int N, int k, double p,Counter  c, double[][] brray)
        {

            if ((N == 0) && (k == 0)) return 1.0;
            if ((N < 0) || (k < 0)) return 0.0;

            if (brray[N][k]<0) {
                c.increment();
                brray[N][k]=(1 - p)*binomial(N-1, k, p,c,brray) + p*binomial(N-1, k-1, p,c,brray);
            }
            return brray[N][k];
            //return p*binomial(N-1, k, p,c) + (1 - p)*binomial(N-1, k-1, p,c);
        }
    public static void main(String[] args)
        {
        //StdOut.printf("%.6f", binomial(100, 50, 0.25));
        Counter c = new Counter("times");
        double[][] brray;
        int N=100, k=50;
        brray = new double[N+1][k+1];
        for (int i = 0; i <=N; i++) {
            for (int j = 0; j <=k ; j++) {
                brray[i][j]=-1;
            }
        }
        StdOut.printf("%.6f\n", binomial(N, k, 0.25,c,brray));
        StdOut.println(c);
        }
}
