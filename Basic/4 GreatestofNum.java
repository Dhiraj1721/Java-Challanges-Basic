import java.util.Scanner;

class GreatestofNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Three Number: ");
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        int Num3 = input.nextInt();

        if(Num1 > Num2 && Num1 > Num3){
            System.out.println("print Num1 Is Greatest.. "+ Num1);
        } else if (Num2 > Num1 && Num2 >Num3) {
            System.out.println("Print Num2 IS Greatest.. "+Num2);
        }
        else {
            System.out.println("Print Num3 Is Greatest.. "+Num3);
        }
    }
}
