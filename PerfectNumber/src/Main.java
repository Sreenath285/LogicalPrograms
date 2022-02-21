import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int res = 0;

        for(int i = 1; i < num; ++i) {
            int temp = num % i;
            if (temp == 0) {
                res += i;
            }
        }
        System.out.println("Result while adding factors except given number : " + res);
        if (num == res) {
            System.out.println("Given number is a perfect number");
        }
        else {
            System.out.println("Given number is not a perfect number");
        }
    }
}
