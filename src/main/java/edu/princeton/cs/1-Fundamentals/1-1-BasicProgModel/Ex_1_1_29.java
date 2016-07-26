// Equal keys. Add to BinarySearch a static method rank() that takes a key and
//     a sorted array of int values (some of which may be equal) as arguments and returns the
//     number of elements that are smaller than the key and a similar method count() that
//     returns the number of elements equal to the key. Note : If i and j are the values returned
//     by rank(key, a) and count(key, a) respectively, then a[i..i+j-1] are the values in
//     the array that are equal to key.
package edu.princeton.cs.algs4;
import java.util.Arrays;
public class Ex_1_1_29 {
    public static int rank(int key, int[] a)
        {
            int Pos = 0;
            int Num_small=0;
            while (Pos < a.length)
            {
                if (a[Pos]<key) {
                    Num_small+=1;
                }
                Pos+=1;

            }
            return Num_small;
        }
    public static int cout(int key, int[] a)
        {
            int Pos = 0;
            int Num_equal=0;
            while (Pos < a.length)
            {
                if (a[Pos]==key) {
                    Num_equal+=1;
                }
                Pos+=1;

            }
            return Num_equal;
        }
    public static void main(String[] args)
        {
            int[] whitelist = In.readInts(args[0]);
            Arrays.sort(whitelist);
            int key=Integer.parseInt(args[1]);

            StdOut.println(rank(key, whitelist));
            StdOut.println(cout(key, whitelist));
            StdOut.println(--key);
            StdOut.println(key);
            // while (!StdIn.isEmpty())
            // {
            //     int key = StdIn.readInt();
            //     StdOut.println(key);
            //     // StdOut.println(rank(key, whitelist));
            //     // StdOut.println(cout(key, whitelist));
            // }

        }
}
