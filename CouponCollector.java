public class CouponCollector
{
    public static void main(String[] args)
    {
        int N=1000,num=0,sofar=0;
        int[] coupon =new int[N];
        while(sofar<N){
            int newcoupon=(int) ((Math.random())*N);
            if(coupon[newcoupon]==0){
                coupon[newcoupon]=1;
                sofar++;}
            num++;
            }
        System.out.print(num);
    }
}
