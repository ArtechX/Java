public class percolation
{
    public static boolean[][] flow(boolean[][] open)
    {
        int n = open.length;
        boolean[][] full = new boolean[n][n];
        for(int j=0;j<n;j++)
            flow(open,full,0,j);
        return full;
    }
    
    public static void flow(boolean[][] open,boolean[][] full,int i,int j)
    {
        //recursion!
        int n = open.length;
        if(i<0 || j<0 || i>=n || j>=n) return;
        if(!open[i][j]) return;
        if(full[i][j]) return;
        full[i][j]=true;
        flow(open,full,i+1,j);
        flow(open,full,i,j+1);
        flow(open,full,i-1,j);
        flow(open,full,i,j-1);
    }
    
    public static boolean percolates(boolean[][] full)
    {
        int n = full.length;
        for(int i=0;i<n;i++)
            if(full[n-1][i]) return true;
        return false;
    }
    
    public static void show(boolean[][] a,boolean which)
    {
        int n = a.length;
        StdDraw.setXscale(-1,n);
        StdDraw.setYscale(-1,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==which) StdDraw.filledSquare(j,n-i-1,0.5);
            }
        }
    }
    
    public static boolean[][] random(int n,double p)
    {
        boolean[][] a = new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=StdRandom.bernoulli(p);
            }
        }
        return a;
    }
    
    public static void curve(int n,double x0,double y0,double x1,double y1)
    {
        double gap = 0.005;
        double err = 0.05;
        int t = 10000;
        double xm = (x0+x1)/2;
        double ym = (y0+y1)/2;
        int sum=0;
        for(int i=0;i<t;i++)
        {
            boolean[][] open = random(n,xm);
            boolean[][] full = flow(open);
            if(percolates(full)) sum++;
        }
        double fxm = (double) sum/t;
        if(x1-x0<gap && Math.abs(ym-fxm)<err)
        {
            StdDraw.line(x0,y0,x1,y1);
            return;
        }
        curve(n,x0,y0,xm,fxm);
        StdDraw.filledCircle(xm,fxm,0.005);
        curve(n,xm,fxm,x1,y1);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]),sum=0;
        double p = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);
        for(int i=0;i<t;i++)
        {
            boolean[][] open = random(n,p);
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            show(open,false);
            StdDraw.setPenColor(StdDraw.BLUE);
            boolean[][] full = flow(open);
            show(full,true);
            StdDraw.show(1000);
            if(percolates(full)) sum++;
        }
        curve(n,0.0,0.0,1.0,1.0);
        StdOut.print((double) sum/t);
    }
}