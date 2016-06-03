public class singlesplit
{
    public static void main(String[] args)
    {
        In file = new In(args[0]);
        Out outfile = new Out("outfile.txt");
        int item = Integer.parseInt(args[1]);
        String line = file.readLine();
        while(line!=null)
        {
            String[] word = line.split(",");
            outfile.println(word[item-1]);
            line = file.readLine();
        }
    }
}