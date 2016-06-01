public class converttobinary {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int v,j,i,sum=0;
        while(n!=0){
            j=0;
            v=1;
            while(v*2<=n){
                v*=2;
                j+=1;
            }
            sum=sum+(int)Math.pow(10,j);
            n=n-v;
        }
        System.out.print(sum);
    }
}