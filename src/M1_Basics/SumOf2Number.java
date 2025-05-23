package M1_Basics;

import java.util.Scanner;

public class SumOf2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("Sum of "+x+" and "+y+" is: "+sum);
    }
}
