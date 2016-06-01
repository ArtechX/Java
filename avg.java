public class avg {
    public static void main(String[] args)
    {
        int x=0,i=0;
        StdOut.print("Numbers: \n");
        while(!StdIn.isEmpty()){
            x += StdIn.readInt();
            i++;
        }
        StdOut.printf("%d\n",x/i);
    }
}