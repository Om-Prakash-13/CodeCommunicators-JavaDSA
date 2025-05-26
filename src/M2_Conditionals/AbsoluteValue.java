package M2_Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is negative.");
            num *= -1; //num = num * -1;
        }else {
            System.out.println("Number is positive.");
        }

        System.out.println("The absolute value is "+num);
    }
}
