import java.util.Scanner;

public class Main {

    static int note[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
    static int rem;
    static int change;
    static int num;
    static int i = 0;
    static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        num = sc.nextInt();
        Main.solve(num, note);
        System.out.println("Total change : " + total);
    }

    public static int solve(int n, int note[]) {
        if (n <= 0)
        {
            System.out.println("No more money needed to be returned");
            return 0;
        }
        else
        {
            if (n >= note[i]) {
                change = n / note[i];
                rem = n % note[i];
                n = rem;
                total += change;
                System.out.println("Number of " + note[i] + " rupee notes to be returned is " + change);
            }
            i++;
            return solve(n, note);
        }
    }

}
