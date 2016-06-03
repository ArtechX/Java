import java.awt.Color;

public class grayscale
{
    public static void main(String[] args)
    {
        Picture pic = new Picture(args[0]);
        for(int x=0;x<pic.width();x++)
        {
            for(int y=0;y<pic.height();y++)
            {
                Color col = pic.get(x,y);
                col = luminance.togray(col);
                pic.set(x,y,col);
            }
        }
        pic.show();
    }
}