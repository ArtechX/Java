import java.awt.Color;

public class allcolor
{
    public static void main(String[] args)
    {
        Picture allcol = new Picture(256*16,256*16);
        for(int i=0;i<16;i++)
        {
            for(int j=0;j<16;j++)
            {
                for(int y=0;y<256;y++)
                {
                    for(int x=0;x<256;x++)
                    {
                        Color col = new Color(16*i+j,x,y);
                        allcol.set(j*256+x,i*256+y,col);
                    }
                }
            }
        }
        allcol.show();
    }
}