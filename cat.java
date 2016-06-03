public class cat
{
    public static void main(String[] args)
    {
        Out out = new Out(args[args.length - 1]);
        for(int i=0;i<args.length-1;i++)
        {
            out.println("**********");
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
        }
        out.println("**********");
    }
}