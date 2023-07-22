// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) { // modulo operator
                sum += i; // sum = sum + i;
            }
        }

//        System.out.println("Sum of even numbers from 0 to 1000 is " + sum);

        int sumOddNumbers = 0;
        int j = 0;
        while (j < 1000) { // body of the loop
            if (j % 2 != 0) { // body of the if statement
                sumOddNumbers += j;
            }
            j++;
        }

//        System.out.println("Sum of odd numbers from 0 to 1000 is " + sumOddNumbers);
        int finalSum = addNumbers(100);
        System.out.println("Sum of n numbers recursive is " + finalSum);

    }

    //recusivity sum of n numbers

    public static int addNumbers(int n) {
        if (n % 2 != 0) n--;

        return sumN(n);
    }

    public static int sumN(int n) {

        if (n > 0) {
            return n + sumN(n - 2);
        } else {
            return 0;
        }
    }
}