import java.util.Scanner;

public class OEUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num for checking odd even using bitwise : ");
        int Number = input.nextInt();

        if ((Number & 1) ==1){
            System.out.println("Number Is odd..");
        }
        else {
            System.out.println("Number is even..");
        }
    }
}
