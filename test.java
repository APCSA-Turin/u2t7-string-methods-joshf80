import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        String word;
        String saved_word;

        System.out.print("Enter first word: ");
        saved_word = scanner.nextLine();

        while (points <= 50) {
            System.out.print("Enter next word: ");
            word = scanner.nextLine();

            if (saved_word.compareTo(word) < 0) {
                points += 2;
                System.out.println("+2 points: current word is alphabetically after the previous word; SCORE: " + points);
            } 
            if (word.compareTo(saved_word) < 0) {
                points -= 5;
                System.out.println("-5 points: current word is alphabetically before the previous word; SCORE: " + points);
            }
            if (word.compareTo(saved_word) == 0) {
                points -= 10;
                System.out.println("-10 points: current word is the exact same word as the previous word; SCORE: " + points);
            }  
            if (saved_word.substring(saved_word.length() - 2).equals(word.substring(0, 2))) {
                points += 5;
                System.out.println("+5 points: last two letters of the previous word match the first two letters of the current word; SCORE: " + points);
            }
            int positon = word.indexOf(saved_word.substring(0, 1));
            if (!(positon == -1)) {
                points += 3;
                System.out.println("+3 points: first letter of the previous word is found somewhere in the current word; SCORE: " + points);
            }
            if (saved_word.length() == word.length()) {
                points += 3;
                System.out.println("+3 points: the current and previous words are the same length; SCORE: " + points);
            }
            

            saved_word = word;
        }
        scanner.close();
    }
}