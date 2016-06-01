public class graycode
{
    public static void graycode(String str,int i)
    {
        if(i<=0) {StdOut.println(str);return;}
        graycode(str+"0",i-1);
        graycode(str+"1",i-1);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        graycode("",n);
    }
}