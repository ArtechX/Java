public class longest
{
    public static void main(String[] args)
    {
        int [] storage = new int[2];
        int s,x,y;
        s = StdIn.readInt();
        x=s;
        y=1;
        while(!StdIn.isEmpty())
        {
            s = StdIn.readInt();
            if (s==x) y++;
            else if (y>storage[1]){
                storage[0]=x;
                storage[1]=y;
                x=s;
                y=1;
            }
            else{x=s;y=1;}
        }
        StdOut.printf("%d occors %d\n",storage[0],storage[1]);
    }
}