import java.util.Scanner;

public class AskUntilQuit {
    public static void main(String[] args) {
        String text = "";
        Scanner input = new Scanner(System.in);

        while (!text.trim().toLowerCase().equals("quit")) {
            System.out.println("Please type whatever");
            text = input.nextLine();
            System.out.println("You typed: " + text);
        }
        }
    }