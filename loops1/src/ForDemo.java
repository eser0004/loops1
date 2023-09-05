public class ForDemo {
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }


        String s = "";
        for (int i = 0; i < 10; i++) {
            s += "*";
            System.out.println(s);
        }

        for (char c = 'A'; c <='Z'; c++) {
            System.out.print(c);
            System.out.print("\n");
        }

        String text = "Eser Turan";
        for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text.charAt(i));

        for (int i = 0; i < 25; i++)
            System.out.println( "I = " + (i + 1));

    }
}
