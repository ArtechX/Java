public class countprime
{
    public static void main(String[] args)
    {
        int n=1000000000,prime=0;
        int[] primetest =new int[n+1];
        for(int j=2;j<=(int) (Math.sqrt(n)+1);j++){
            for(int i=j;i+j<n+1;i+=j){
                if(primetest[i+j]==0) primetest[i+j]=1;
            }
        }
        for(int i=0;i<n+1;i++){
            if(primetest[i]==0) prime++;
        }
        System.out.print(prime-2);
    }
}

