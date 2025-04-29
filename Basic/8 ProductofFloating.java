import java.util.Scanner;

class ProductofFloating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two floating Number :");
        float Num1 = input.nextFloat();
        float Num2 = input.nextFloat();

        float product = Num1 * Num2 ;

        System.out.println("Prodcut Of Floating Num is : "+ product);
    }
}
