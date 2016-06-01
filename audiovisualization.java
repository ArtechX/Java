public class audiovisualization
{   
    public static void main(String[] args)
    {
        double[] a = StdAudio.read("test.wav");
        StdDraw.setYscale(-1.0,1.0);
        StdDraw.setXscale(0.0,1000000.0);
        for(int i=0;true;i++)
        {
            StdDraw.point(i,a[i]);
        }
    }
}