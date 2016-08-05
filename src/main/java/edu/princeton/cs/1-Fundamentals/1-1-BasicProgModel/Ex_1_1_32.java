// Histogram. Suppose that the standard input stream is a sequence of double
// values. Write a program that takes an integer N and two double values l and r from the
// command line and uses StdDraw to plot a histogram of the count of the numbers in the
// standard input stream that fall in each of the N intervals defined by dividing (l , r) into
//     N equal-sized intervals.

//java Ex_1_1_32 500 0 1000000 < largeT.txt

package edu.princeton.cs.algs4;
public class Ex_1_1_32 {

    public static void main(String[] args) {
        int N= Integer.parseInt(args[0]);
        double l= Double.parseDouble(args[1]);
        double r= Double.parseDouble(args[2]);
        double interval=(r-l)/N;
        int[] Histogram=new int[N];
        while (!StdIn.isEmpty())
        {
            double key = StdIn.readDouble();
            if (key>=l && key<=r){
                Histogram[(int)((key-l)/interval)]+=1;
            }

        }
        double Maxy=StdStats.max(Histogram);
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(l,r);
        StdDraw.setYscale(0,Maxy);
        for (int i = 0; i < N; i++)
        {
            double x = l+interval*i;
            double y = Histogram[i]/2.0;
            double rw = interval/2.0;
            double rh = Histogram[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);

        }


    }
}
