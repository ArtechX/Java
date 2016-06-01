import java.awt.Color;

public class luminance
{
    public static double lum(Color color)
    {
        return 0.299*color.getRed() + 0.587*color.getGreen() + 0.144*color.getBlue();
    }
    
    public static boolean compatible(Color a,Color b)
    {
        return Math.abs(lum(a) - lum(b)) >= 128;
    }
    
    public static Color togray(Color color) {
        int y = (int) (Math.round(lum(color)));  
        Color gray = new Color(y, y, y);
        return gray;
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[6];
        for (int i = 0; i < 6; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        Color c1 = new Color(a[0], a[1], a[2]);
        Color c2 = new Color(a[3], a[4], a[5]);
        StdOut.println(compatible(c1, c2));
    }
}