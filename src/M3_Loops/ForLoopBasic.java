package M3_Loops;

public class ForLoopBasic {
    public static void main(String[] args) {
        int i = 1;
        for (; i < 5;) {
            System.out.println(i);
            i--;
        }
        System.out.println("Out of the for loop.");
    }
}