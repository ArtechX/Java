public class matrixmulti
{
    public static void main(String[] args)
    {
        int m=5,n=5,q=5;
        int[][] matrix1 =new int[m][n];
        int[][] matrix2 =new int[n][q];
        int[][] matrix3 =new int[m][q];
        for(int i=0;i<q;i++){
            for(int j=0;j<m;j++){
                int sum=0;
                for(int a=0;a<n;a++){
                    sum+=matrix1[j][a]*matrix2[a][i];
                }
                matrix3[j][i]=sum;
            }
        }
    }
}

