public class array_lottery
{
    public static void main(String[] args)
    {
        int M=50;
        int N=1000;
        int[] box = new int[N];
        int[] lottery = new int[M];
        for(int i=0;i<N;i++) box[i]=i+1;
        for(int i=0;i<M;i++){
            lottery[i]=box[Math.max((int)(Math.random()*N)-1,0)];
            for(int h=0;h<N;h++){
                int s=h+Math.max((int) (Math.random()*(N-h)) , 0);
                int t=box[s];
                box[s]=box[h];
                box[h]=t;
            }
        }
        for(int i=0;i<M;i++){
            System.out.printf("%d ",lottery[i]);
        }
    }
}

