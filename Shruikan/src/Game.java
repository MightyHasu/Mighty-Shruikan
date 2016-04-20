import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int livesLeft;
    private static boolean letterFound = false;
    private static boolean repeated;
    private static char guessLetter;
    public static LinkedHashSet<String> entries = new LinkedHashSet<String>();
    private static List<String> secretWords;
    private static boolean playing;
    public static boolean validCategory = true;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Random wordSelector = new Random();
        playing = true;
        boolean dead = false;
        boolean gameWon = false;

        // играта ще продължи докато потребителя излезе от нея или има празна категория
        while (playing) {
            if (!entries.isEmpty()) {
                entries.clear();
            }

            // Инициализация на прозореца с правилата на играта и менюто за избор на категория
            VisualControls.initializeNewGame();

            String category = input.nextLine();
            // Зарежда списъка с думи за избраната категория
            secretWords = Dictionaries.selection(category, secretWords);

            while (!validCategory) {
                System.out.println("Грешен избор! Опитайте отново");
                category = input.nextLine();
                secretWords = Dictionaries.selection(category, secretWords);
            }

            // Проверка за празна категория.
            if (secretWords.size() == 0) {
                VisualControls.initializeNewGame();
                System.out.println("\nЗа избраната категория няма повече думи! Изберете нова!\n");
                category = input.nextLine();
                secretWords = Dictionaries.selection(category, secretWords);
            }

            while (secretWords.size() > 0) {
                String currentWord = pickWord(wordSelector).toUpperCase().trim();

                char[] toGuess = currentWord.toCharArray();
                char[] guessed = new char[currentWord.length()];
                initializeGuessedWord(guessed);
                for (int i = 0; i < toGuess.length; i++) {
                    if (toGuess[i] == ' ') {
                        guessed[i] = ' ';
                    }

                }
                VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);

                while (!dead && !gameWon) {
                    String userEntry;
                    while (true) {
                        try {
                            userEntry = input.nextLine();
                            VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);
                            if(userEntry.equals("")){
                                System.out.println("Неправилно въведен символ! \n" +
                                        "Въведете буква на кирилица!");
                                //Thread.sleep(500);
                                //VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);
                            }
                            else if (Character.isLetter(userEntry.charAt(0)) && userEntry.length() == 1 &&               // Проверка за валиден вход
                                    Character.UnicodeBlock.CYRILLIC.equals(Character.UnicodeBlock.of(userEntry.charAt(0)))) {
                                break;

                            } else {
                                System.out.println("Неправилно въведен символ! \n" +
                                        "Въведете буква на кирилица!");
                                //Thread.sleep(500);
                                //VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);
                            }
                        } catch (Exception e) {
                            System.out.println("Въведете буква на кирилица!");
                            //Thread.currentThread().interrupt();
                            //VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);

                        }
                    }
                    while (userEntry.equals("")) {
                        VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);
                        userEntry = input.nextLine();
                    }

                    guessLetter = userEntry.toUpperCase().charAt(0);

                    checkGuess(toGuess, guessed);

                    dead = checkDead(currentWord, input, dead, guessed, gameWon);
                    gameWon = checkWon(currentWord, input, dead, guessed, gameWon);
                    if (dead || gameWon) {
                        break;
                    }

                    letterFound = false;
                }

                String choice = input.nextLine().trim().toLowerCase();
                while (!choice.equals("y") && !choice.equals("n")) {
                    System.out.println("Невалиден вход! Въведете вашият избор отново");
                    choice = input.nextLine().trim().toLowerCase();
                }
                if (choice.equals("y")) {
                    dead = false;
                    gameWon = false;
                    break;
                } else {
                    playing = false;
                    break;
                }

            }
        }

        VisualControls.endGame();
        input.nextLine();
    }

    private static void checkGuess(char[] toGuess, char[] guessed) {
        if (entries.contains("" + guessLetter)) {
            VisualControls.refreshWindow(livesLeft, guessed, true, guessLetter, letterFound, true);
        } else {
            entries.add("" + guessLetter);
            letterLookup(toGuess, guessed);

            if (!letterFound) {
                livesLeft--;
            }

            VisualControls.refreshWindow(livesLeft, guessed, false, guessLetter, letterFound, true);
        }
    }

    private static void letterLookup(char[] toGuess, char[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (guessLetter == toGuess[i]) {
                guessed[i] = guessLetter;
                letterFound = true;
            }
        }
    }

    private static void initializeGuessedWord(char[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '*';
        }

        livesLeft = 6;
    }

    private static String pickWord(Random wordSelector) {
        int newWordIndex = wordSelector.nextInt(secretWords.size());
        String currentWord = secretWords.get(newWordIndex);
        secretWords.remove(newWordIndex);
        return currentWord;
    }

    private static boolean checkDead(String currentWord, Scanner input, boolean dead, char[] guessed, boolean gameWon) {
        if (livesLeft < 1) {
            VisualControls.printDeath(currentWord);
            return true;
        }
        return false;
    }

    private static boolean checkWon(String currentWord, Scanner input, boolean dead, char[] guessed, boolean gameWon) {
        int starsLeft = 0;
        for (char c : guessed) {
            if (c == '*') {
                starsLeft++;
            }
        }

        if (starsLeft == 0) {

            VisualControls.printWin();
            return true;

        } else {
            return false;
        }
    }
}