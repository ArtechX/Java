import java.awt.Color;

public class edgedetectoe
{
    public static void main(String[] args)
    {
        //Sobel method
        int[][] m1 = {
            { -1,  0,  1 },
            { -2,  0,  2 },
            { -1,  0,  1 }
        };

        int[][] m2 = {
            {  1,  2,  1 },
            {  0,  0,  0 },
            { -1, -2, -1 }
        };
        
        Picture source = new Picture(args[0]);
        int width = source.width();
        int height = source.height();
        Picture target = new Picture(width,height);
        for(int y=1;y<height-1;y++)
        {
            for(int x=1;x<width-1;x++)
            {
                double g1 = 0.0;
                double g2 = 0.0;
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        int lumvalue = (int) (Math.round(luminance.lum(source.get(x-1+j,y-1+i))));
                        g1+=lumvalue*m1[j][i];
                        g2+=lumvalue*m2[j][i];
                    }
                }
                int value = 255 - ((int) Math.sqrt(g1*g1 + g2*g2));
                if(value<0) value=0;
                if(value>255) value=255;
                Color newcol = new Color(value,value,value);
                target.set(x,y,newcol);
            }
        }
        target.show();
    }
}