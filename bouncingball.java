public class bouncingball
{
    public static void main(String[] args)
    {
        StdDraw.setXscale(-1.0,1.0);
        StdDraw.setYscale(-1.0,1.0);
        double rx=0.48,ry=0.86,vx=0.015,vy=0.023,radius=0.05,sum=0;
        while(true)
        {
            if(Math.abs(rx+vx)+radius>1.0) vx=-vx;
            if(Math.abs(ry+vy)+radius>1.0) vy=-vy;
            rx+=vx;
            ry+=vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx,ry,radius);
            StdDraw.show(20);
        }
    }
}