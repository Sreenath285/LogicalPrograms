import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int decNum = sc.nextInt();
        sc.close();

        int[] binVal = toBinary(decNum);
        System.out.println("Binary value: ");
        for(int i = 0;i <= binVal.length-1;i++){
            System.out.print(binVal[i]);
        }
    }

    public static int[] toBinary(int decimal) {
        int binary[] = new int[8];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i = 0; i < binary.length / 2; i++) {
            int temp = binary[i];
            binary[i] = binary[binary.length - i - 1];
            binary[binary.length - i - 1] = temp;
        }
        return binary;
    }
}
