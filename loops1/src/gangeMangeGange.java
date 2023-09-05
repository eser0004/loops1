import java.util.Scanner;

public class gangeMangeGange {
    public static void main(String[] args) {
        /*
        Gange mange gange ... indtil! (do-while)
        Lav et program, der lader brugeren indtaste et kommatal. Tallet ganges med pi og resultatet vises.
        Fortsæt indtil brugeren taster 0.
        */
        Scanner input = new Scanner(System.in);

        double nummer = -1;

        do {
            System.out.println("Enter a number: ");
            nummer = input.nextDouble();
            nummer = Math.PI * nummer;
            System.out.println("Your number * Pie equals = " + nummer);

        } while (nummer != 0);

    }
}
