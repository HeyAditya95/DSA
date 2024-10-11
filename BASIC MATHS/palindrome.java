import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
        int N = sc.nextInt();
        int dup = N ;
        int revN = 0;
        while (dup>0)
        {
            int D = dup%10;
            dup = dup / 10;
            revN=(revN*10) + D;
            
        }
        if (N == revN){
            System.out.println("yes its a palindrome");
        } else {System.out.println("its not a palindrome number ");}
    }
    
}
