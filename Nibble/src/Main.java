import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int decNum = sc.nextInt();
        sc.close();

        int[] binaryVal = toBinary(decNum);
        System.out.println("Binary value : ");
        for(int i = 0;i <= binaryVal.length-1;i++){
            System.out.print(binaryVal[i]);
        }
        System.out.println("\nBinary value after swapping nibbles : ");

        int[] swapBin = swapBinary(binaryVal);
        for(int i = 0;i <= swapBin.length-1;i++){
            System.out.print(swapBin[i]);
        }

        double swapDec = toDecimal(swapBin);
        System.out.println("\nDecimal value of swapped nibbles : " + swapDec);
    }

    public static int[] toBinary(int decimal){
        int binary[] = new int[8];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        binary = reverseBinary(binary);
        return binary;
    }

    public static int[] reverseBinary(int[] binary){
        for(int i = 0; i < binary.length / 2; i++){
            int temp = binary[i];
            binary[i] = binary[binary.length - i - 1];
            binary[binary.length - i - 1] = temp;
        }
        return binary;
    }

    public static double toDecimal(int[] binary){
        double decimal = 0;
        binary = reverseBinary(binary);
        for(int i = 0; i <= binary.length-1; i++){
            decimal = decimal + (binary[i] * Math.pow(2, i));
        }
        return decimal;
    }

    public static int[] swapBinary(int[] binary){
        int[] swappedBinary = new int[binary.length];
        for(int j = 0; j < binary.length; j++){
            if(j < binary.length/2)
                swappedBinary[j] = binary[(binary.length/2) +j];
            else if(j < binary.length)
                swappedBinary[j] = binary[j-(binary.length/2)];
        }
        return swappedBinary;
    }
}
