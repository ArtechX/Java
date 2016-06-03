import java.awt.Color; 

public class makehorizon
{
    public static void main(String[] args)
    {
        Picture pic = new Picture(args[0]);
        int width = pic.width();
        int height = pic.height();
        Picture newpic = new Picture(height,width);
        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                Color col = pic.get(x,y);
                newpic.set(y,x,col);
            }
        }
        newpic.show();
    }
}