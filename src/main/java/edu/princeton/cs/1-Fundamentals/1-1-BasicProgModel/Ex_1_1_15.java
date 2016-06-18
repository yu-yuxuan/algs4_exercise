// 1.1.15 Write a static method histogram() that takes an array a[] of int values and
// an integer M as arguments and returns an array of length M whose ith entry is the number of times the integer i appeared in the argument array. If the values in a[] are all
// between 0 and M-1, the sum of the values in the returned array should be equal to
//     a.length.

package edu.princeton.cs.algs4;
public class Ex_1_1_15 {

    public static int[] histogram(int[] a, int M){
        int[] b=new int[M];
        for (int i = 0; i < M; i++) {
            int j=0;
            b[i]=0;
            while (j<a.length) {
                if (a[j]==i) {
                    b[i]+=1;
                }
                ++j;
            }
        }
        return b;
    }
//another methods, since a[i] value can be set as the location of b. b[a[i]]++

    public static void main(String[] args) {
        // case 1
        //int[] a={-1,-1,0,1,1,1,2,3,4,5,6,7};
        //case 2
        int N=8;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(9);
        for (int i = 0; i < N; i++)
            StdOut.printf("%2d", a[i]);
        StdOut.println();


        int M=6;

        int[] b=new int[M];
        b=Ex_1_1_15.histogram(a, M);
        int sum=0;
        for (int i = 0; i < M; i++) {
            StdOut.printf("%d",b[i]);
            sum+=b[i];
        }
        StdOut.println("\n####sum####");
        StdOut.printf("%d\n",sum);
        StdOut.println("####a####");
        StdOut.printf("%d",a.length);

    }
}
