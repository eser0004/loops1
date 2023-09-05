import java.util.Scanner;

public class askuntilDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int number = -1;
        do {
            System.out.println("Enter an Even number ");
            number = input.nextInt();

        } while (number != -1);

    }
}
