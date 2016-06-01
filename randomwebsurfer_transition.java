public class randomwebsurfer_transition
{   
    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        double[][] tranmatrix = new double[n][n];
        int[] degree = new int[n];
        while(!StdIn.isEmpty())
        {
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            degree[i]+=1;
            tranmatrix[i][j]+=0.9;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                tranmatrix[i][j]=tranmatrix[i][j]/degree[i]+0.1/n;
            }
        }
        StdOut.printf("%d\n",n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                StdOut.printf("%.2f ",tranmatrix[i][j]);
            }
            StdOut.println();
        }
    }
}