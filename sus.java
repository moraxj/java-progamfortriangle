import java.util.Scanner;

public class sus{
    
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
      int n = sc.nextInt();
        
      
           int i = 1;
        for(i = 1;i<=(n/2)+1;i++){
          char a = 97;
          for(int j =1;j<=i;j++){
            System.out.print(a);
            a++;
          }
          System.out.println();
        }
        for(i=(n/2);i>0;i--){
          char a = 97;
          for(int j =1;j<=i;j++){
            System.out.print(a);
            a++;
          }
          System.out.println();
        }
        
}}
