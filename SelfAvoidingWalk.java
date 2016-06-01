public class SelfAvoidingWalk
{
    public static void main(String[] args)
    {
        int T=100,N=40,deadend=0;
        for(int i=1;i<=T;i++){
            int[][] city=new int[N][N];
            int x=(int) N/2,y=(int) N/2;
            city[x][y]=1;
            while(x!=N-1 && y!=N-1 && x!=0 && y!=0){
                if((city[x][y+1]==1) && (city[x+1][y]==1) && (city[x][y-1]==1)
                       && (city[x-1][y]==1)) {deadend++;break;}
                double j = Math.random();
                if (j<0.25) {if(city[x][y+1]==1) continue; else y++;}
                else if (j<0.5) {if(city[x+1][y]==1) continue; else x++;}
                else if (j<0.75) {if(city[x][y-1]==1) continue; else y--;}
                else if (j<1.0) {if(city[x-1][y]==1) continue; else x--;}
                city[x][y]=1;
            }
        }
        /* (total/T)*100=0  */
        System.out.println((100*(T-deadend))/T + " % Escape");
    }
}

