// 1.1.19 Run the following program on your computer:
// public class Fibonacci
// {
//     public static long F(int N)
//         {
//             if (N == 0) return 0;
//             if (N == 1) return 1;
//             return F(N-1) + F(N-2);
//         }
//     public static void main(String[] args)
//         {
//             for (int N = 0; N < 100; N++)
//                 StdOut.println(N + " " + F(N));
//         }
// }

// What is the largest value of N for which this program takes less than 1 hour to compute
// the value of F(N)?
// Develop a better implementation of F(N) that saves computed values in an array.



package edu.princeton.cs.algs4;
public class Ex_1_1_19 {

    public static long F(int N)
        {
            if (N == 0) return 0;
            if (N == 1) return 1;
            return F(N-1) + F(N-2);
        }

    public static long F2(long[] F_array,int N)
        {
            if (N == 0) F_array[N]=0;
            if (N == 1) F_array[N]=1;
            if (N>1) F_array[N]=F_array[N-1]+F_array[N-2];
            return F_array[N];
        }



    public static void main(String[] args)
        {
            long startTime = 0;
            long endTime = 0;
            int  Nmax = 30;
            long[] F_array=new long[Nmax];
            for (int N = 0; N < Nmax; N++)
            {
                startTime = System.nanoTime();
                StdOut.print(" "+N + " " + F(N));
                endTime = System.nanoTime();
                StdOut.printf(" %15.3f",(endTime - startTime)/1000000.0);
                StdOut.println();
                StdOut.println("###########################");
                startTime = System.nanoTime();
                StdOut.print("#"+N + " " + F2(F_array,N));
                endTime = System.nanoTime();
                StdOut.printf(" %15.3f#\n",(endTime - startTime)/1000000.0);
                StdOut.println("###########################");
            }
        }
}


//milliseconds.
//-------------------------- after the time follows also the Fibonacci
// 44 701408733
// 4946.0691820
// 45 1134903170
// 7953.8246420
// 46 1836311903
// 12929.5964390
// 47 2971215073
// 20792.1381300
// 48 4807526976
// 33566.0362680
// 49 7778742049
// 54988.7135170
//So the largest value of N will be 56 or 57 for which this program takes less than 1 hour .
//new program will be 3e8


// Better
// git@github.com:aistrate/AlgorithmsSedgewick.git
// public static long Fib(int N)
// {
//     long[] f = new long[N+1];
//     return Fib(N, f);
// }

// public static long Fib(int N, long[] f)
// {
//     if (f[N] == 0)
//     {
//         if (N == 1)
//             f[N] = 1;
//         else if (N > 1)
//             f[N] = Fib(N-1, f) + Fib(N-2, f);
//     }

//     return f[N];
// }

// public static void main(String[] args)
// {
// //        for (int N = 0; N < 100; N++)
// //            StdOut.println(N + " " + F(N));
//     for (int N = 0; N < 1000; N++)
//         StdOut.println(N + " " + Fib(N));
// }
