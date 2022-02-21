import java.util.Scanner;

public class Main {

    /*
     * static variables for storing start and end time
     */
    static double start = 0, stop = 0;

    /**
     * method to put start time and print it
     */
    static void startTime() {
        start = System.currentTimeMillis();
        System.out.println("Started at : " + start);
    }

    /**
     * method to put stop time and print it
     */
    static void stopTime() {
        stop = System.currentTimeMillis();
        System.out.println("Stopped at : " + stop);
    }

    /**
     * method to calculate elapsed time
     */
    static void elapsedTime() {
        System.out.println("Elapsed time : " + (stop - start) / 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to start");
        int toStart = sc.nextInt();
        startTime();
        System.out.println("Enter any number to stop");
        int toStop = sc.nextInt();
        sc.close();
        stopTime();
        elapsedTime();
    }
}
