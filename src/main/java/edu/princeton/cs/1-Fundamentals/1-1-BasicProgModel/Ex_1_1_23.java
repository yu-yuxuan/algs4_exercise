// 1.1.23 Add to the BinarySearch test client the ability to respond to a second argument: + to print numbers from standard input that are not in the whitelist, - to print
//     numbers that are in the whitelist.

package edu.princeton.cs.algs4;
import java.util.Arrays;
public class Ex_1_1_23 {
    public static int rank(int key, int[] a)
        {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi)
            {
                int mid = lo + (hi - lo) / 2;
                if (key < a[mid]) hi = mid - 1;
                else if (key > a[mid]) lo = mid + 1;
                else return mid;
            }
            return -1;
        }
    public static void main(String[] args)
        {
            int[] whitelist = In.readInts(args[0]);
            Arrays.sort(whitelist);
            String wl_in_out= args[1];
            StdOut.println(wl_in_out);
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                switch (wl_in_out){
                case "+":    if (rank(key, whitelist) == -1)
                        StdOut.println(key);
                    break;
                case "-":if (rank(key, whitelist) != -1)
                    StdOut.println(key);
                    break;
                default: StdOut.println("######");
                    break;
                }
            }

        }
}
