import java.util.Scanner;

public class Task2 {

    private static final String CHECK_LINE = "Вячеслав";
    private static final String VALID_ANSWER = "Привет, Вячеслав";
    private static final String INVALID_ANSWER = "Нет такого имени";
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String input = console.nextLine();
        doCheck(input);
    }

    private static void doCheck(String line) {
        if (line.equals(CHECK_LINE)) {
            System.out.println(VALID_ANSWER);
        } else {
            System.out.println(INVALID_ANSWER);
        }
    }
}
