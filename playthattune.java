public class playthattune
{
    public static double[] sum(double[] a,double[] b,double awt,double bwt)
    {
        double[] c = new double[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i] = a[i]*awt+b[i]*bwt;
        }
        return c;
    }
    
    public static double[] tone(double hz, double t)
    {
        int sps = 44100;
        int n = (int) (sps*t);
        double[] a = new double[n+1];
        for(int i=0;i<=n;i++)
            a[i] = Math.sin(2*Math.PI*i*hz/sps);
        return a;
    }
    
    public static double[] note(int pitch,double t)
    {
        double hz = 440.0*Math.pow(2,pitch/12.0);
        double[] a = tone(hz,t);
        double[] hi = tone(2*hz,t);
        double[] lo = tone(hz/2,t);
        double[] h = sum(hi,lo,0.5,0.5);
        return sum(a,h,0.5,0.5);
    }
    
    public static void main(String[] args)
    {
        while(!StdIn.isEmpty())
        {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch,duration);
            StdAudio.play(a);
        }
    }
}