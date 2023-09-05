import java.util.Scanner;

public class heltalwhile {
    public static void main(String[] args) {

        int heltal = -1;
        Scanner input = new Scanner(System.in);

        if (!(heltal % 2 == 0)) {
            System.out.println("Enter a number until it's an Even number");
            heltal = input.nextInt();
            System.out.println("Your number is odd");
        }

        while (!(heltal % 2 == 0)) {
            System.out.println("Enter a number until it's an Even number");
            heltal = input.nextInt();
            System.out.println(heltal + " Your number is even");
        }



            }
        }
