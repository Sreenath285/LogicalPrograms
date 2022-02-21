public class MonthlyPayment {

    public static void main(String args[]) {

        int principle = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        int rate = Integer.parseInt(args[2]);
        monthlyPayment(principle, year, rate);
        
    }

    public static void monthlyPayment(int pri, int yr, double rt) {
        double n = 12 * yr;
        double r = rt / (12 * 100);
        double payment = (pri * r) / (1 - Math.pow((1 + r), -n));
        System.out.println("Monthly payment : " + payment);
    }
}
