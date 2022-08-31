public class seriesodd {
    public void serousodd(int n,int a,int odd){
      for(int i = 1;i<=n;i++){
        System.out.print(a+" ");
        a += odd;
        odd +=2;
      }
    }
}
