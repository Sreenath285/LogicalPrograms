import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2;
        int n, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        n = sc.nextInt();
        System.out.println("Enter num1 value : ");
        num1 = sc.nextInt();
        System.out.println("Enter num2 value : ");
        num2 = sc.nextInt();
        System.out.print(num1 + " " + num2);

        for (int i = 2; i <= n; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }
}
