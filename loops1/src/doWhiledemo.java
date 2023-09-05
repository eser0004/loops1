import java.util.Scanner;

public class doWhiledemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("\nPlease enter text: ");
            text = in.nextLine();
            System.out.println("You entered: " + text);
        } while (!text.equals("quit"));
    }
}
