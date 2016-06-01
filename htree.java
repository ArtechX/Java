public class htree
{
    public static void drawtree(int n,double length,double x1,double y1)
    {
        if(n==0) return;
        double x0=x1-length/2,x2=x1+length/2;
        double y0=y1-length/2,y2=y1+length/2;
        StdDraw.line(x0,y2,x0,y0);
        StdDraw.line(x2,y2,x2,y0);
        StdDraw.line(x0,y1,x2,y1);
        drawtree(n-1,length/2,x0,y0);
        drawtree(n-1,length/2,x0,y2);
        drawtree(n-1,length/2,x2,y0);
        drawtree(n-1,length/2,x2,y2);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        drawtree(n,0.5,0.5,0.5);
    }
}