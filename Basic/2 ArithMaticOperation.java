import java.util.Scanner;

class ArithMaticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two Number For doing Arithmatic operation: ");
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();

        int Add = Num1 + Num2 ;
        int Mul = Num1 * Num2;
        int sub = Num1 - Num2;
        int div = Num1 / Num2;

        System.out.println("Additon of two num is: " + Add);
        System.out.println("Multi of two num is: "+ Mul);
        System.out.println("Sub of Two Num is: " + sub);
        System.out.println("div of Two Num is: "+ div);


    }
}
