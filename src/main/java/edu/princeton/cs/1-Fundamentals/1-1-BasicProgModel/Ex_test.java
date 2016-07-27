package edu.princeton.cs.algs4;
public class Ex_test {
    public static void main(String[] args) {
        int key=23, mid = 5;
        int[] a={10,11,12,16,18,23,29,33,48,48,54,57,68,77,84,98};
        if      (key < a[mid])  StdOut.println("small") ;
        else if (key > a[mid]) StdOut.println("large");
        else
        {
            while (--mid >= 0 && a[mid] == key){
            StdOut.println(mid+1);
            }
        }
    }

}
