/*random move*/

public class randomwebsurfer_Markov
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
        double[] rank = new double[n];
        rank[0]=1.0;
        for(int s=0;s<t;s++)
        {
            double[] temprank = new double[n];
            for(int j=0;j<n;j++)
            {
                double sum=0.0;
                for(int i=0;i<n;i++)
                {
                    sum+=rank[i]*p[i][j];
                }
                temprank[j]=sum;
            }
            for(int a=0;a<n;a++)
            {
                rank[a]=temprank[a];
            }
        }
        for(int i=0;i<n;i++)
        {
            StdOut.printf("%f ",rank[i]);
        }
        StdOut.println();
    }
}