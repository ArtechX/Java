public class gameoflife
{
    public static boolean testlive(boolean[][] old,int i,int j,int n)
    {
        if(i<0 || j<0 || i>=n || j>=n) return false;
        if(old[i][j]) return true;
        else return false;
    }
    
    public static int livenum(boolean[][] old,int i,int j,int n)
    {
        int live=0;
        if(testlive(old,i-1,j-1,n)) live++;
        if(testlive(old,i-1,j,n)) live++;
        if(testlive(old,i-1,j+1,n)) live++;
        if(testlive(old,i,j-1,n)) live++;
        if(testlive(old,i,j+1,n)) live++;
        if(testlive(old,i+1,j-1,n)) live++;
        if(testlive(old,i+1,j,n)) live++;
        if(testlive(old,i+1,j+1,n)) live++;
        return live;
    }
    
    public static void show(boolean[][] arr)
    {
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLUE);
        percolation.show(arr,true);
        StdDraw.setPenColor(StdDraw.BLACK);
        percolation.show(arr,false);
        StdDraw.show(3000);
    }
    
    public static void copyarray(boolean[][] old,boolean[][] thenew,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                old[i][j]=thenew[i][j];
            }
        }
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int T = Integer.parseInt(args[2]);
        boolean [][] old = percolation.random(n,p);
        show(old);
        StdDraw.show(3000);
        for(int t=0;t<T;t++)
        {
            boolean [][] anew = new boolean[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(old[i][j])
                    {
                        int live = livenum(old,i,j,n);
                        if(live==1 || live>3) anew[i][j]=false;
                        else anew[i][j]=old[i][j];
                    }
                    else
                    {
                        int live = livenum(old,i,j,n);
                        if(live==3) anew[i][j]=true;
                        else anew[i][j]=old[i][j];
                    }
                }
            }
            show(anew);
            copyarray(old,anew,n);
        }
    }
}