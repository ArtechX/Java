public class wave
{
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        int width = source.width();
        int height = source.height();
        Picture target = new Picture(width,height);
        int amplitude = Integer.parseInt(args[1]);
        int frequency = Integer.parseInt(args[2]);
        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                int newx = x;
                int newy =(int) (y + amplitude*Math.sin(2*Math.PI*x/frequency));
                if(newx>=width || newy>=height || newx<0 || newy<0) continue;
                target.set(x,y,source.get(newx,newy));
            }
        }
        target.show();
    }
}

