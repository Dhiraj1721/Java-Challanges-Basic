import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        System.out.println("Number Before Swapping");
        Scanner input = new Scanner(System.in);
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        int temp;
        System.out.println("Num before swapping are: "+ Num1 + " " + Num2);
        temp = Num1;
        Num1 = Num2;
        Num2 = temp;
        System.out.println("Number After are :" + Num1 + " "+ Num2);
    }
}
