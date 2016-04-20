import java.io.IOException;

public class VisualControls {

    public static void refreshWindow(Integer livesLeft, char[] guessed, boolean repeated, char guessLetter, boolean letterGuessed, boolean gameStarted) {
        clearConsole();
        Drawings.PrintMan(livesLeft);
        if (gameStarted) {
            guessOutcome(letterGuessed, repeated, guessLetter);
        } else {
            System.out.println();
        }

        System.out.println("Избрани букви: " + Game.entries);
        System.out.println("Избран дракон: " + Dictionaries.selectedCategory);
        System.out.println("Оставащи животи: " + livesLeft + " !");
        printGuessWord(guessed);
        System.out.print("Твоят избор: ");
        System.out.println();
    }

    public static void clearConsole() {
        for (int clear = 0; clear < 150; clear++) {
            System.out.println("");
        }
    }

    public static void printCategorySelection() {
        System.out.print("\nГотов ли си за борба? :) ");
        System.out.println("Избери дракон с който ще се бориш:\n1. Пазител на държави\n2. Пазител на градове\n"
                + "3. Пазител на реки\n");
        System.out.print("Твоят избор за дракон №: ");
        Sound.Road(6);

    }

    public static void printRules() {
        System.out.println("Легенда:");
        System.out.println("Galbatorix е най-мощният магьосник в света на изчезналите дракони - Алагейзиа.\n"+
                "Той е покорил хиляди от чудовищните същества, но едно от тях, все още му се противопоставя.\n"+
                "Това е драконът Shruikan! Той е охраняван от три дракона, които крият ключовете към унищожението му.\n"+
                "Това били драконите Country, Towny и Rivery. Towny бил български дракон, а другите два с по-сложен произход.\n"+
                "Силата на магьосника расте с всяка открита дума-ключ.\n"+
                "Помогни на магьосника да разгадае думите и победи пазителите. \n"+
                "Успех!!!");
        System.out.println();
    }

    private static void printGuessWord(char[] guessed) {
        System.out.println();
        System.out.println();
        for (char c : guessed) {
            System.out.printf("%s ", c);
        }
        System.out.println();
    }

    public static void printDeath(String currentWord) {
        clearConsole();
        Drawings.PrintMan(0);
        System.out.println("Ключът на дракона е: " + currentWord);
        newGamePrompt();
    }

    public static void endGame() {
        clearConsole();

        try {
            Drawings.printThankYou();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Благодарим, че се забавляхвахте с нас!");
        System.out.println();
        System.out.println("Натиснете клавиш \"ENTER\" за изход...");
    }

    public static void printWin() {
        clearConsole();

        Drawings.printWin();

        System.out.println("");
        newGamePrompt();
    }

    private static void guessOutcome(boolean letterGuessed, boolean repeated, char chLetter) {
        if (repeated) {
            System.out.println("Буква \"" + chLetter + "\" вече е избирана.");
        } else if (letterGuessed) {
            System.out.println("Браво! Скоро ще разгадаеш тайният ключ!");
        } else {
            System.out.println("Съжалявам! Буква \"" + chLetter + "\" не се съдържа в търсеният ключ!");
        }

        System.out.println();
    }

    private static void newGamePrompt() {
        System.out.print("Ще играеш ли отново? (Y - Да; N - Не!): ");
    }

    public static void initializeNewGame() throws IOException {
        VisualControls.clearConsole();
        Drawings.printHangman();
        VisualControls.printRules();
        VisualControls.printCategorySelection();
    }
}