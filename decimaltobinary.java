public class decimaltobinary
{
    public static void binary(int n)
    {
        if(n==0) return;
        binary(n/2);
        StdOut.print(n%2);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        binary(n);
    }
}