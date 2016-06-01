public class Minesweeper
{
    public static void main(String[] args)
    {
        double p=0.4;
        int M=20,N=20;
        int[][] mine = new int[M+2][N+2];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                double s = Math.random();
                if(s<=p) mine[i][j]=1;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(mine[i+1][j+1]==1){System.out.print("* ");continue;}
                int sum=0;
                if(mine[i][j]==1) sum++;
                if(mine[i][j+1]==1) sum++;
                if(mine[i][j+2]==1) sum++;
                if(mine[i+1][j]==1) sum++;
                if(mine[i+1][j+2]==1) sum++;
                if(mine[i+2][j]==1) sum++;
                if(mine[i+2][j+1]==1) sum++;
                if(mine[i+2][j+2]==1) sum++;
                System.out.printf("%d ",sum);
            }
            System.out.println();
        }
    }
}

