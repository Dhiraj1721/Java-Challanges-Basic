import java.util.Scanner;
 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the data to calculate C.I: ");
        float Principle = input.nextFloat();
        float Rate = input.nextFloat();
        float time = input.nextFloat();

        float CI = Principle * (1+(Rate/100)) * time;
        System.out.println("C.I For given data is : "+ CI);
    }
}
