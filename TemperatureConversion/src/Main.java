import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter an option : ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            System.out.print("Enter the temperature in fahrenheit :  ");
            int temperature = sc.nextInt();
            temperatureConversion(temperature, option);
        } else if(option == 2){
            System.out.print("Enter the temperature in celsius :  ");
            int temperature = sc.nextInt();
            temperatureConversion(temperature, option);
        } else{
            System.out.println("Invalid option");
        }
        sc.close();
    }
    static void temperatureConversion(int temp, int opt){

        if(opt == 1){
            double toCelsius = (temp - 32) * 5/9;
            System.out.print("In celsius : " + toCelsius);
        } else if (temp == 2){
            double toFahrenheit = (temp * 9/5) + 32;
            System.out.print("In fahrenheit : " + toFahrenheit);
        }

    }
}
