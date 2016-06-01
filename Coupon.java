public class Coupon
{
    public static int uniform(int n)
    {
        return (int) (Math.random()*n);
    }
    
    public static int collect(int n)
    {
        int[] thecard = new int[n];
        int card=0,total=0;
        while(total!=n)
        {
            int val = uniform(n);
            card++;
            if (thecard[val]==0)
            {
                thecard[val]=1;
                total++;
            }
        }
        return card;
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int count = collect(n);
        StdOut.println(count);
    }
}