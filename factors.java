public class factors {
    public static void main(String[] args) {
        int n=1234567890,i=2;
        if(n==1) System.out.print(n);
        while(n>2){
            while(n%i!=0){
                i++;
            }
            System.out.print(i);
            System.out.print(" ");
            n=n/i;
        }
        if(n==1) System.out.print("");
        else System.out.print(n);
    }
}