public class DayOfWeek {

    public static void main(String[] args) {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);
            dayOfWeek(day, month, year);
    }
    static void dayOfWeek(int m, int d, int y){
        int year = y - (14 - m) / 12;
        int x = year + (year/4) - (year/100) + (year/400);
        int month = m + 12 * ((14 - m)/12) - 2;
        int day = (d + x + (31*month)/12) % 7;
        System.out.print("Day : ");
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid date");
                break;
        }
    }
}
