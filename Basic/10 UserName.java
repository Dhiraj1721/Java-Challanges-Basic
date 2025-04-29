import java.util.Scanner;

class UserName {
    public static void main(String[] args) {
        System.out.print("Please Enter Your Name: ");
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + " To KG Coding");
    }
}
