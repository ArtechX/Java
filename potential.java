import java.awt.Color;

public class potential
{
    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        Charge[] a = new Charge[n];
        for(int i=0;i<n;i++)
        {
            a[i] = new Charge(StdIn.readDouble(),StdIn.readDouble(),StdIn.readDouble());
        }
        int size = 512;
        Picture pic = new Picture(size,size);
        for(int x=0;x<size;x++)
        {
            for(int y=0;y<size;y++)
            {
                double v = 0.0;
                for(int t=0;t<n;t++)
                {
                    v+=a[t].potentialAt((double) x/size,(double) y/size); // no () outside the x/size
                }
                int g = 128 + (int) (v / 2.0e10);
                if(g<0) g=0;
                if(g>255) g=255;
                Color c = new Color(g,g,g);
                pic.set(x,size-y-1,c);
            }
        }
        pic.show();
    }
}