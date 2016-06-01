public class guessnumber {
    public static void main(String[] args)
    {
        int n=(int) (Math.random()*100);
        do{
            StdOut.print("What is the number?\n");
            int x = StdIn.readInt();
            if(x==n) {StdOut.print("Correct\n");return;}
            else if(x<n){StdOut.print("Too low\n");continue;}
            else if(x>n){StdOut.print("Too high\n");continue;}
        }while(true);
    }
}