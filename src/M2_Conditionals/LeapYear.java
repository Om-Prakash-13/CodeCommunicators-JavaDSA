package M2_Conditionals;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num % 4 == 0){
            // potential
            if(num % 400 == 0){
                System.out.println("Leap year.");
            }else {
                if(num % 100 == 0){
                    System.out.println("Not a leap year.");
                }else {
                    System.out.println("Leap year.");
                }

            }
        }else {
            System.out.println("Not a leap year.");
        }
    }
}
