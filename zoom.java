public class zoom
{
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        source.show();
        int width = source.width();
        int height = source.height();
        double scale = Double.parseDouble(args[1]);
        int newwidth = (int) (width*scale);
        int newheight = (int) (scale*height);
        Picture target = new Picture(newwidth,newheight);
        int cx =(int) (Double.parseDouble(args[1])*width);
        int cy =(int) (Double.parseDouble(args[2])*height);
        for(int y=0;y<newheight;y++)
        {
            for(int x=0;x<newwidth;x++)
            {
                int newx = (int) (x+cx-newwidth/2);
                int newy = (int) (y+cy-newheight/2);
                if(newx>=width || newy>=height || newx<0 || newy<0) continue;
                target.set(x,y,source.get(newx,newy));
            }
        }
        
        Picture target2 = new Picture(width,height);
        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                int newx = x*newwidth/width;
                int newy = y*newheight/height;
                target2.set(x,y,target.get(newx,newy));
            }
        }
        target2.show();
    }
}