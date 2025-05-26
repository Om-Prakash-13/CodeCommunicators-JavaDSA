package M2_Conditionals;

import java.util.Scanner;

public class AreaPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of a rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter breath of a rectangle: ");
        int bre = sc.nextInt();

        int area = len * bre;
        int peri = 2 * (len + bre);

        if(area > peri){
            System.out.println("Yes, area is greater.");
        }
        else {
            System.out.println("No, preimeter is greater.");
        }

    }
}
