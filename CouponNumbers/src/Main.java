import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons:");
        int num = sc.nextInt();
        char[] s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        System.out.println(s[1]);

        for (int i = 0; i < num; i++) {
            int random = (int) (Math.random() * 999999999);
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(s[random % s.length]);
                random /= s.length;
            }
            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}
