import java.util.Scanner;

class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int N = sc.nextInt();
        int count = 0;
        while(N>0)
        {
            N = N/10;
            count++;
        }
        System.out.println(count);

    }
}