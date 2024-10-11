import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number : ");
         int N = sc.nextInt();
         int dup = N ;
         int sum =0;
         while(dup>0)
         {
            int D = dup % 10 ;
            dup /= 10;
            sum += D*D*D;
         }
         System.out.println(sum);
         if(sum == N){
            System.out.println("yes its a armstrong number ");
         } else {System.out.println("no it is not a palindrome number : ");}

    }
}
