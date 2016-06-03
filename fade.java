import java.awt.Color;

public class fade
{
    public static Color blend(Color s,Color t,double coeff)
    {
        double r = s.getRed()*(1-coeff) + t.getRed()*coeff;
        double g = s.getGreen()*(1-coeff) + t.getGreen()*coeff;
        double b = s.getBlue()*(1-coeff) + t.getBlue()*coeff;
        return new Color((int) r,(int) g,(int) b);
    }
    
    public static void main(String[] args)
    {
        Picture source = new Picture(args[0]);
        Picture target = new Picture(args[1]);
        int t = Integer.parseInt(args[2]);
        int width = source.width();
        int height = source.height();
        Picture newpic =new Picture(width,height);
        for(int i=0;i<t;i++)
        {
            for(int x=0;x<width;x++)
            {
                for(int y=0;y<height;y++)
                {
                    Color oldcol = source.get(x,y);
                    Color targetcolor = target.get(x,y);
                    Color newcolor = blend(oldcol,targetcolor,(double) i/t);
                    newpic.set(x,y,newcolor);
                }
            }
            newpic.show();
        }
    }
}