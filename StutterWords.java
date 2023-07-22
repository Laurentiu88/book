public class StutterWords {
    public static void main(String[] args) {

        String text = " I am me you are you and me are both unique";

        String[] words = text.split(" ");
        System.out.println("Number of words: " + words.length);
        System.out.println("Words: ");
        StringBuilder stutterWord = new StringBuilder();
        for (String word : words) {
            for ( int i = 0; i < 2; i++) {
                stutterWord.append(word).append(" ");
        }

        System.out.println(stutterWord);

        }
    }
}
