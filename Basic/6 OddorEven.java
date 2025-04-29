import java.util.Scanner;

class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int Num = input.nextInt();

        if(Num %2 == 0){
            System.out.println("The given Num is Even..");
        }
        else {
            System.out.println("The given Num is odd..");
        }
    }
}
