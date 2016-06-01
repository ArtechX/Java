public class permutation
{
    public static String[] recurpermutation(int n,int i,String[] p)
    {
        if(i==n) return p;
        String[] newp = new String[p.length*(i+1)];
        String newchar =Character.toString((char) ('a'+i));
        for(int j=0;j<i+1;j++)
        {
            for(int s=0;s<p.length;s++)
            {
                String oldstring = p[s];
                newp[j*p.length+s]=oldstring.substring(0,j)+newchar+oldstring.substring(j,i);
            }
        }
        return recurpermutation(n,i+1,newp);
    }
    
    public static void main(String[] args)
    {
        String[] p = {"a"};
        int n = Integer.parseInt(args[0]);
        matrix.printString1D(recurpermutation(n,1,p));
    }
}