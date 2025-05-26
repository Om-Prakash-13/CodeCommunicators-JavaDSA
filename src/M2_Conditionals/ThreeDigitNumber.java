package M2_Conditionals;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 99 && num < 999 ){
            System.out.println("Number is 3 digit.");
        }else {
            System.out.println("Number is not 3 digit.");
        }

    }
}
