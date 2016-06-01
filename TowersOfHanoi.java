public class TowersOfHanoi
{
    public static void move(int n,boolean left)
    {
        if(n==0) return;
        move(n-1,!left);
        if(left) StdOut.printf("%d left \n",n);
        else StdOut.printf("%d right \n",n);
        move(n-1,!left);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        move(n,true);
    }
}