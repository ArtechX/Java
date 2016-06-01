/*random move*/

public class randomwebsurfer_simulate
{   
    public static void main(String[] args)
    {
        int t = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        double[][] p = new double [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                p[i][j]= StdIn.readDouble();
            }
        }
        int page = 0;
        int[] freq = new int[n];
        for(int i=0;i<t;i++)
        {
            double r = Math.random();
            double sum = 0.0;
            for(int j=0;j<n;j++)
            {
                sum += p[page][j];
                if(r<sum) {page=j;break;}
            }
            freq[page]++;
        }
        StdDraw.clear();
        StdDraw.setXscale(-1,n);
        StdDraw.setYscale(0,t);
        StdDraw.setPenRadius(0.5/n);
        for(int i=0;i<n;i++)
        {
            StdOut.printf("%8.5f ",(double) freq[i]/t);
            StdDraw.line(i,0,i,freq[i]);
        }
        StdOut.println();
    }
}