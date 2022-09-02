public class factorial {
    public void facto(int n){
        //5!= 5*4*3*2*1
        int fac = 1;int s = 0;
        for(int i = 1;i<=n;i++){
            fac = fac*i;
            s = s+fac;
            
        }
        System.err.println("the factorial is: "+fac);
        System.out.print("the sum of factorials is "+ s);
    }
}
