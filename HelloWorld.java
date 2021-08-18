public class HelloWorld {
    public static void main(String[] args) {

       int i, j, k, x = 1;

       for (i=0; i<=5; i++){
           for (j=1; j<=5-i; j++){
               System.out.print("s ");
           }

           for (j=0; j<=i; j++){
               if (j==0 || i==0){
                   x =1; //utk nyetak 1
               } else {
                   x = x * (i-j+1) / j;
                   System.out.print(x +"  ");
               }
           }
           System.out.println();
       }
    }
}
