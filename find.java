public class find {
    public static void main(String[] args) {
      int a,b,c,d;
      for(a=1;a<=100;a++){
          for(b=1;b<=100;b++){
              for(c=1;c<=100;c++){
                  for(d=1;d<=100;d++){
                      if (a*a+b*b==c*c+d*d) System.out.printf("%d %d %d %d\n",a,b,c,d);
  
                  }
              }
          }
      }
    }
}