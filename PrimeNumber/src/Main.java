import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if ((num % i) == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
