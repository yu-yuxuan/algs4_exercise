// 1.1.27 Binomial distribution. Estimate the number of recursive calls that would be
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
public class Ex_1_1_27 {
    public static double binomial(int N, int k, double p,Counter  c)
        {

            if ((N == 0) && (k == 0)) return 1.0;
            if ((N < 0) || (k < 0)) return 0.0;
            c.increment();
            return (1 - p)*binomial(N-1, k, p,c) + p*binomial(N-1, k-1, p,c);
            //return p*binomial(N-1, k, p,c) + (1 - p)*binomial(N-1, k-1, p,c);
        }
    public static void main(String[] args) {
        //StdOut.printf("%.6f", binomial(100, 50, 0.25));
        Counter c = new Counter("times");
        StdOut.printf("%.6f\n", binomial(20, 10, 0.5,c));
        StdOut.println(c);
    }
}
