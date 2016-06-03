public class genefind
{
    public static void main(String[] args)
    {
        String start = args[0];
        String end = args[1];
        String genome = StdIn.readAll();
        int beg = -1;
        for(int i=0;i<genome.length() - 2;i++)
        {
            String codon = genome.substring(i,i+3);
            if(codon.equals(start)) beg=i;
            if(codon.equals(end) && beg!=-1)
            {
                String sub = genome.substring(beg+3,i);
                if(sub.length() % 3==0)
                {
                    StdOut.println(sub);
                    beg = -1;
                }
            }
        }
    }
}