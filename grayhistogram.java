public class grayhistogram
{
    public static void main(String[] args)
    {
        Picture pic = new Picture(args[0]);
        int[] gray = new int [256];
        int width = pic.width();
        int height = pic.height();
        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                int graycol =(int) (Math.round(luminance.lum(pic.get(x,y))));
                if(graycol==0) graycol=1;
                gray[graycol-1]++;
            }
        }
        int max = 0;
        for(int i=0;i<256;i++)
        {
            if(gray[i]>max) max=gray[i];
        }
        StdDraw.setXscale(-1,260);
        StdDraw.setYscale(-1,max+10);
        StdDraw.setPenRadius(0.5/256);
        for(int i=0;i<256;i++)
        {
            StdDraw.line(i,0,i,gray[i]);
        }
    }
}