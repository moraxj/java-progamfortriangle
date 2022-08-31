public class amogus {
    void fib(int n){
     
      int a = 0;
      int b = 1;
      int c = 0;
      System.out.print(a+ " ");
      System.out.print(b+" ");
      for(int i = 0;i<=n;i++){
        c = a+b;
        a = b;
        b=c;
        System.out.print(c+" ");
    }
    

    }
}