public class findprime {
    public static void main(String[] args) {
            for(int n=10000000;n>=2;n--){
            if ((n%2 != 0) && (n%3 != 0) && (n%5 != 0) && (n%7 != 0)){
                for(int i=2;i<=Math.sqrt(n)+1;i++){
                    if(n%i==0) break;
                    else if(i==(int)Math.sqrt(n)+1) System.out.printf("%d ",n);
                    else continue;
                }
            }
            else continue;
        }
    }
}