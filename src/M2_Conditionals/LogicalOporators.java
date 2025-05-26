package M2_Conditionals;

public class LogicalOporators {
    public static void main(String[] args) {
        // && || !
        //and oporator
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(true && false && true);

        //or oporator
        System.out.println("Or oporator.");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || false || false);

        // not
        System.out.println("Not oporator.");
        System.out.println(!true);
        System.out.println(!(5 > 6));
    }
}
