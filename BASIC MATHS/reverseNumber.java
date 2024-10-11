import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int N = sc.nextInt();
    int revN = 0;
    while (N>0)
    {
        int lastDigit = N % 10;
        N = N / 10;
        revN = (revN * 10) + lastDigit;
    }
    System.out.println(revN);
}
}
