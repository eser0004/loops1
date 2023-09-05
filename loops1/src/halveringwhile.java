import java.util.Scanner;

public class halveringwhile {
    public static void main(String[] args) {

        int number = 2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number = ");
        number = input.nextInt();

        while (number != 1) {

            number = number / 2;
            System.out.println(number);
        }
    }
}
