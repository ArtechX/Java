import java.awt.Color;

public class scale
{
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        source.show();
        int width = source.width();
        int height = source.height();
        int newwidth = Integer.parseInt(args[1]);
        int newheight = Integer.parseInt(args[2]);
        Picture target = new Picture(newwidth,newheight);
        for(int y=0;y<newheight;y++)
        {
            for(int x=0;x<newwidth;x++)
            {
                int newx = x*width/newwidth;
                int newy = y*height/newheight;
                target.set(x,y,source.get(newx,newy));
            }
        }
        source.show();
        target.show();
    }
}