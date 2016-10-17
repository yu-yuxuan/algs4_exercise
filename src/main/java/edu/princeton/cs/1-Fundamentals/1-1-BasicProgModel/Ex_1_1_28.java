//Remove duplicates. Modify the test client in BinarySearch to remove any duplicate keys in the whitelist after the sort.
package edu.princeton.cs.algs4;
import java.util.Arrays;
public class Ex_1_1_28 {
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
            int[] nodupes = new int[whitelist.length];
            int[] nodupes_sort = new int[whitelist.length];
            int i=0;
            for(int j=0;j<whitelist.length;j++){

                if (rank(whitelist[j], nodupes_sort) == -1)
                {
                    nodupes[i] = whitelist[j];
                    i++;
                    //nodupes_sort=nodupes; will copy the pointer so don't use
                    nodupes_sort = Arrays.copyOf(nodupes, nodupes.length);
                    Arrays.sort(nodupes_sort);
                }

            }
            Arrays.sort(nodupes);
// it will have overlap problem   :PROBLEM:
            // int[] whitelist = In.readInts(args[0]);
            // Arrays.sort(whitelist);
            // while (!StdIn.isEmpty())
            // {
            //     int key = StdIn.readInt();
            //     if (rank(key, whitelist) == -1)
            //         StdOut.println(key);
            // }
            for (int j = 0; j < whitelist.length ; j++) {
                StdOut.println(nodupes[j]);
            }
        }

}


// The  thought is the number (from small to large) in A file, check whether it is appeared in B file, if not add to it, otherwise jump it.
