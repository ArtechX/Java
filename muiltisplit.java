public class muiltisplit
{
    public static void main(String[] args)
    {
        String name = args[0];
        In file = new In(name);
        int n = Integer.parseInt(args[1]);
        Out[] outfiles = new Out[n];
        for(int i=0;i<n;i++)
        {
            outfiles[i] = new Out(name + (i+1) + ".txt");
        }
        while(!file.isEmpty())
        {
            String line = file.readLine();
            String[] words = line.split(",");
            for(int i=0;i<n;i++)
            {
                outfiles[i].println(words[i]);
            }
        }
    }
}