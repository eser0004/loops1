import java.util.Scanner;

public class udskriv10StjernerForogDoWhile {
    public static void main(String[] args) {

        /*
        Udskriv 10 stjerner (for og do-while)
        Brug en for-løkke til at udskrive en * (asterisk) 10 gange.
        Udbyg dernæst programmet, så brugeren skal indtaste antallet af stjerner.
        Udbyg igen programmet, så det fortsætter med at spørge brugeren og udskrive stjerner, indtil der tastes 0.
         */

        Scanner input = new Scanner(System.in);

        String asterisk = "*";
        int numberOfStars = -1;



        do {
            System.out.println("\nEnter a number of stars: ");
            numberOfStars = input.nextInt();
            input.nextLine();
        }while ( numberOfStars < 1 || numberOfStars > 100);

        for (int i = 0; i < numberOfStars; i++) {
            System.out.print(asterisk);
        }



    } }