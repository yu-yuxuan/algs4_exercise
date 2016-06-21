// 1.1.22 Write a version of BinarySearch that uses the recursive rank() given on page
// 25 and traces the method calls. Each time the recursive method is called, print the argument values lo and hi, indented by the depth of the recursion. Hint: Add an argument
//     to the recursive method that keeps track of the depth.
package edu.princeton.cs.algs4;
import java.util.Arrays;
public class Ex_1_1_22 {
    public static int rank(int key, int[] a,int depth)
        { return rank(key, a, 0, a.length - 1,depth); }
    public static int rank(int key, int[] a, int lo, int hi,int depth)
        { // Index of key in a[], if present, is not smaller than lo
            // and not larger than hi.
            if (lo > hi) return -1;
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                depth+=1;
                for (int i = 0; i < depth; i++) {
                    StdOut.print(" ");
                }
                StdOut.printf("%d %d\n",lo,hi);
                return rank(key, a, lo, mid - 1,depth);
            }
            else if (key > a[mid]) {
                depth+=1;
                for (int i = 0; i < depth; i++) {
                    StdOut.print(" ");
                }
                StdOut.printf("%d %d\n",lo,hi);
                return rank(key, a, mid + 1, hi,depth);
            }
            else {
                depth+=1;
                for (int i = 0; i < depth; i++) {
                    StdOut.print(" ");
                }
                StdOut.printf("%d %d\n",lo,hi);
                return mid;
            }
        }
    public static void main(String[] args)
        {
            int[] whitelist = In.readInts(args[0]);

            Arrays.sort(whitelist);
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                int depth=0;
                if (rank(key, whitelist,depth) == -1)
                    StdOut.println(key);
            }
        }

}
