import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        System.out.println("Please Enter to Number for Add: ");
        Scanner number = new Scanner(System.in);
        int Num1 = number.nextInt();
        int Num2 = number.nextInt();
        int Num3 = Num1 + Num2 ;
        System.out.println("Add is: " + Num3);
    }
}
