public class maxmin
{
    public static void main(String[] args)
    {
        int max,min,s;
        int x = StdIn.readInt();
        max=x;
        min=x;
        while(!StdIn.isEmpty())
        {
            x = StdIn.readInt();
            if (x<min) min=x;
            if (x>max) max=x;
        }
        StdOut.printf("max is %d, min is %d ",max,min);
    }
}