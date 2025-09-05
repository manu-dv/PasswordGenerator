import java.util.Scanner;

public class PasswordGenerator {
    private static final String CONSONANTS = "bcdfghjklmnpqrsvwxyz";
    private static final String VOWELS = "aeiou";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$€&/\\ºª()=?*+-,;.:><\"";

    private static final int PAIRS = 3;
    private static final int NUMBER_OF_NUMBERS = 2;
    private static final int NUMBER_OF_SYMBOLS = 1;

    public static void main(String[] args) {
        String choice;
        StringBuilder password;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                password = generatePassword();
                System.out.println("Password: " + password);

                System.out.print("""
                        Do you like the password or would you prefer to generate a new one?
                        (yes, to generate a new one/no, to keep de password):""");
                choice = sc.nextLine().toLowerCase();
                System.out.println();
            } while (!choice.equals("no") && !choice.equals("n"));
        }
    }

    private static StringBuilder generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < PAIRS; i++) {
            password.append(generatePair());
        }
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            password.append(getRandomChar(NUMBERS));
        }
        for (int i = 0; i < NUMBER_OF_SYMBOLS; i++) {
            password.append(getRandomChar(SYMBOLS));
        }
        return password;
    }

    private static char getRandomChar(String optios) {
        return optios.charAt((int)(Math.random() * optios.length()));
    }

    private static String generatePair() {
        String pair = "";
        pair += getRandomChar(CONSONANTS);
        pair += getRandomChar(VOWELS);
        return pair;
    }
}
