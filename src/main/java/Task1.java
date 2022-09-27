import java.util.Scanner;

public class Task1 {

    private static final Scanner console = new Scanner(System.in);
    private static final int CHECK_NUMBER = 7;
    private static final String ALLOW_ANSWER = "Привет";

    public static void main(String[] args) {
        int input = console.nextInt();
        doCheck(input);
    }

    private static void doCheck(int initialNumber) {
        if (initialNumber > 7) {
            System.out.println(ALLOW_ANSWER);
        }
    }
}

[((()))]
[(a(b(c))(d)(e(f))]