public class NumberOccurenceInArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 1, 2};
        int[] duplicateNumbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateNumbers[j] = numbers[i];
                }
            }
        }
        for (int k = 0; k < duplicateNumbers.length; k++) {
            if (duplicateNumbers[k] == 0) {
                continue;
            }
            System.out.println("Number is " + duplicateNumbers[k] + " on position " + k);
        }
    }
}