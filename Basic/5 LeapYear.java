import java.util.Scanner;

 class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter year for checking it is leap year or not: ");
        int Year = input.nextInt();

        if(Year % 4 ==0 || Year % 100 == 0){
            System.out.println("Year is leap year..");
        }
        else {
            System.out.println("year is not leap year..");
        }
    }
}
