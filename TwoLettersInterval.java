import java.util.Scanner;

public class TwoLettersInterval {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first letter: ");
        char letterOne = scanner.next().charAt(0);

        System.out.println("Enter the second letter: ");
        char letterTwo = scanner.next().charAt(0);

        if (letterOne < letterTwo) {

            for (int i = letterOne + 1; i < letterTwo; i++) {
                // System.out.println(i);
                char c = (char) i;
                System.out.println(c);
            }
        } else if (letterTwo < letterOne) {
            for (int i = letterOne - 1; i > letterTwo; i--) {
                char c = (char) i;
                System.out.println(c);
            }
        }

        int charDiff = letterOne - letterTwo;
        int absDiff = Math.abs(charDiff);
        int diff = absDiff - 1;
        //System.out.println(charDiff);
        //System.out.println(absDiff);
        System.out.println(diff);
    }
}
