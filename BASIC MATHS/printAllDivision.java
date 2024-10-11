import java.util.*;
public class printAllDivision {
    public static void main(String[] args) {
        //this have time complexity of O(N)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int N = sc.nextInt();
    //    for(int i=1;i<=N;i++){
    //     if(N % i == 0){
    //         System.out.println(i);
    //     }
    //    }

    //with another method
    for(int i=1;i<=Math.sqrt(36);i++)
    {
        if(N%i==0){
            System.out.println(i);
            if(N/i != i)
        {
            System.out.println(N/i);
        }
        } 
    }

    }
}
