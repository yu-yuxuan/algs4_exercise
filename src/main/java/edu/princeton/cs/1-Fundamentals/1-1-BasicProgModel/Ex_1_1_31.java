// Random connections. Write a program that takes as command-line arguments
// an integer N and a double value p (between 0 and 1), plots N equally spaced dots of size
//     .05 on the circumference of a circle, and then, with probability p for each pair of points,
//     draws a gray line connecting them.
package edu.princeton.cs.algs4;
public class Ex_1_1_31 {
    public static void Plotpoints(int N){
        double[] theta=new double[N];
        double[] Point_x=new double[N];
        double[] Point_y=new double[N];
        for (int i = 0; i < N; i++) {
            theta[i]=i*Math.PI/N;
            Point_x=Math.cos(theta[i]);
            Point_y=Math.sin(theta[i]);
        }
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        for (int i = 0; i < N; i++) {
            StdDraw.point(Point_x[i],Point_y[i]);
        }

        //StdDraw.setPenColor(StdDraw.MAGENTA);
    }
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        double p=Double.parseDouble(args[1]);
        Plotpoints(N);
    }
}
