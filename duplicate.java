public class duplicate
{
    public static void main(String[] args)
    {
        int pos=0;
        int[] a={9,6,4,7,8,1,2,3,10,10};
        for(int i=0;i<10;i++){
            if(a[i]==i+1) continue;
            else if(i==9) {System.out.print("Duplicate");break;}
            for(int j=i+1;j<10;j++){
                if(a[j]==i+1) {pos=j;
                    break;}
                else if (j==9) {System.out.print("Duplicate");i=11;return;}
            }
            int temp=a[pos];
            a[pos]=a[i];
            a[i]=temp;
        }
    }
}

