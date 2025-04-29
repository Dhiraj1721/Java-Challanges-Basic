import java.util.Scanner;

class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of all side of Rectangle : ");
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int sideC = input.nextInt();
        int sideD = input.nextInt();

        int Perimeter = sideA + sideB + sideC +sideD;
        System.out.println("Perimeter Of Rectangle is : "+ Perimeter);


    }
}
