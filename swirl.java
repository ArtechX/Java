public class swirl
{
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        source.show();
        int width = source.width();
        int height = source.height();
        Picture target = new Picture(width,height);
        double cx = (width-1)/2;
        double cy = (height-1)/2;
        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                double dx=x-cx;
                double dy=y-cy;
                double distance = Math.sqrt(dx*dx+dy*dy);
                double angle=(Math.PI*distance)/256;
                int newx =(int) (dx*Math.cos(angle)-dy*Math.sin(angle)+cx);
                int newy =(int) (dx*Math.sin(angle)+dy*Math.cos(angle)+cy);
                if(newx>=width || newy>=height || newx<0 || newy<0) continue;
                target.set(x,y,source.get(newx,newy));
            }
        }
        target.show();
    }
}