// Random connections. Write a program that takes as command-line arguments
// an integer N and a double value p (between 0 and 1), plots N equally spaced dots of size
//     .05 on the circumference of a circle, and then, with probability p for each pair of points,
//     draws a gray line connecting them.
package edu.princeton.cs.algs4;
public class Ex_1_1_31 {
    public static void Plotpoints(int N, double p){
        double[] theta=new double[N];
        double[] Point_x=new double[N];
        double[] Point_y=new double[N];
        for (int i = 0; i < N; i++) {
            theta[i]=i*2.0*Math.PI/N;
            //StdOut.printf("%.5f\n", theta[i]);
            Point_x[i]=Math.cos(theta[i]);
            Point_y[i]=Math.sin(theta[i]);
        }
        //StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setXscale(-1.5, 1.5);
        StdDraw.setYscale(-1.5, 1.5);
        for (int i = 0; i < N; i++) {
            //StdOut.printf("%.5f xxxxxx %.5f\n", Point_x[i],Point_y[i]);
            StdDraw.filledCircle(Point_x[i],Point_y[i],0.05);
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                StdOut.printf("%d xxxxxx %d\n", i,j);
                double Rand=Math.random();
                if (Rand<p) {
                    //StdOut.printf("%.5f\n", Rand);
                    StdDraw.line(Point_x[i],Point_y[i],Point_x[j],Point_y[j]);
                }
                // else if (Rand>=0.5) {
                //     StdDraw.line(x1, y1, x2, y2);
                // }
            }
        }
        //StdDraw.setPenColor(StdDraw.MAGENTA);
    }
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        double p=Double.parseDouble(args[1]);
        Plotpoints(N,p);
    }
}
