import java.util.*;
public class printAllDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int N = sc.nextInt();
       for(int i=1;i<=N;i++){
        if(N % i == 0){
            System.out.println(i);
        }
       }

    }
}
