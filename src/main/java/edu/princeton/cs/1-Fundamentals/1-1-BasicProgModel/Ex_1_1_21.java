// 1.1.21 Write a program that reads in lines from standard input with each line containing a name and two integers and then uses printf() to print a table with a column of
// the names, the integers, and the result of dividing the first by the second, accurate to
//     three decimal places. You could use a program like this to tabulate batting averages for
//     baseball players or grades for students.
package edu.princeton.cs.algs4;
public class Ex_1_1_21 {

    public static void main(String[] args) {
        int N=0;
        int Nmax=1000;
        String[] name= new String[Nmax+1];
        int[] First= new int[Nmax+1];
        int[] Second= new int[Nmax+1];
        String Line;
        String[] Information=new String[3];

        while (!StdIn.isEmpty())
        {
            Line= StdIn.readLine();
            Information=Line.split(" ");
            name[N]=Information[0];
            First[N]=Integer.parseInt(Information[1]);
            Second[N]=Integer.parseInt(Information[2]);
            N++;
        }
        StdOut.printf("|%10s|%8s|%8s|%8s|\n", "name","First","Second","Result");
        StdOut.printf("|%10s+%8s+%8s+%8s|\n", "----------","--------","--------","--------");
        for (int i = 0; i < N; i++) {
            StdOut.printf("|%10s|%8d|%8d|%8.3f|\n", name[i],First[i],Second[i],1.0*First[i]/Second[i]);
        }
    }
}
