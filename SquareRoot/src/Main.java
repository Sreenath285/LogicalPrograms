import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Enter a positive number");
        }
        sc.close();
        sqrt(num);
    }

    public static void sqrt(int n) {
        double epsilon = 1e-15;
        double temp = n;
        double squareRoot;
        while (true) {
            squareRoot = 0.5 * (temp + (n / temp));
            if (Math.abs(squareRoot - temp) < epsilon) {
                break;
            }
            temp = squareRoot;
        }
        System.out.println("Square root : " + squareRoot);
    }
}
