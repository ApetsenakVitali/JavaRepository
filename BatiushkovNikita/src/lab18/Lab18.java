package lab18;

// String with the last letter of a words

public class Lab18 {
    public static void main(String[] args) {
        String str = "thE StrinG clasS representS characteR";
        System.out.println(getWordLastLetters(str));
    }

    private static String getWordLastLetters(String str) {
        int strLength = str.length();
        String lastLetters = "";
        for (int i = 0; i < strLength; i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ') {
                lastLetters += str.charAt(i - 1);
            }
        }
        return lastLetters;
    }
}
