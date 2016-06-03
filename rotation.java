public class rotation
{
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        int width = source.width();
        int height = source.height();
        Picture target = new Picture(width,height);
        int cx = (int) (width-1)/2;
        int cy = (int) (height-1)/2;
        int degree = Integer.parseInt(args[1]);
        for(int t=0;t<=degree;t++)
        {
            for(int y=0;y<height;y++)
            {
                for(int x=0;x<width;x++)
                {
                    int newx =(int) ((x-cx)*Math.cos(Math.toRadians(t))-(y-cy)*Math.sin(Math.toRadians(t))+cx);
                    int newy =(int) ((x-cx)*Math.sin(Math.toRadians(t))+(y-cy)*Math.cos(Math.toRadians(t))+cy);
                    if(newx>=width || newy>=height || newx<0 || newy<0) continue;
                    target.set(x,y,source.get(newx,newy));
                }
            }
            target.show();
        }
    }
}