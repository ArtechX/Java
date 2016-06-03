
public class matrix
{
    public static double dot(double[] a,double[] b)
    {
        double sum = 0.0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i]*b[i];
        }
        return sum;
    }
    
    public static double[][] multiply(double[][] a,double[][] b)
    {
        int m = a.length;
        int n = a[0].length;
        int s = b[0].length;
        double[][] mn = new double[m][s];
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                double sum = 0.0;
                for(int r=0;r<n;r++)
                {
                    sum+=a[i][r]*b[r][j];
                }
                mn[i][j]=sum;
            }
        }
        return mn;
    }
    
    public static double[][] transpose(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        double[][] trans = new double[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                trans[j][i]=a[i][j];
            }
        }
        return trans;
    }
    
    public static void print1D(double[] a)
    {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            StdOut.printf("%f ",a[i]);
        }
        StdOut.println();
    }
    
    public static void printString1D(String[] a)
    {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            StdOut.printf(a[i]+" ");
        }
        StdOut.println();
    }
    
    public static void print2D(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                StdOut.printf("%f ",a[i][j]);
            }
            StdOut.println();
        }
    }
}