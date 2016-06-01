public class postalbarcodes
{
    public static void drawabar(int i,int n,int height)
    {
        if(n==1) StdDraw.line(i,0.0,i,height);
        else StdDraw.line(i,0.0,i,height/2);
    }
    
    public static void drawnum(int x,int num,int height)
    {
        int[] bar = new int[5];
        if (num==0) {bar[0]=1;bar[1]=1;}
        else if (num==1) {bar[3]=1;bar[4]=1;}
        else if (num==2) {bar[2]=1;bar[4]=1;}
        else if (num==3) {bar[2]=1;bar[3]=1;}
        else if (num==4) {bar[1]=1;bar[4]=1;}
        else if (num==5) {bar[1]=1;bar[3]=1;}
        else if (num==6) {bar[1]=1;bar[2]=1;}
        else if (num==7) {bar[0]=1;bar[4]=1;}
        else if (num==8) {bar[0]=1;bar[3]=1;}
        else if (num==9) {bar[0]=1;bar[2]=1;}
        for(int i=0;i<5;i++)
        {
            drawabar(x+i,bar[i],height);
        }
    }
    
    public static int checknumber(int x)
    {
        int sum = 0;
        while(x>0)
        {
            sum+=x%10;
            x=x/10;
        }
        return sum%10;
    }
    
    public static void main(String[] args)
    {
        String numstr = StdIn.readString();
        int length=numstr.length();
        int scale = (length+1)*5;
        StdDraw.setXscale(-2.0,scale+1);
        StdDraw.setYscale(-1.0,scale);
        StdDraw.setPenRadius(0.5/scale);
        int s = 0;
        for(int i=1;i<=length;i++)
        {
            int digit=Integer.parseInt(numstr.substring(i-1,i));
            drawnum(s*5,digit,scale);
            s++;
        }
        int check = checknumber(Integer.parseInt(numstr));
        drawnum(s*5,check,scale);
        StdDraw.line(-1.0,0.0,-1.0,scale);
        StdDraw.line(scale,0.0,scale,scale);
    }
}