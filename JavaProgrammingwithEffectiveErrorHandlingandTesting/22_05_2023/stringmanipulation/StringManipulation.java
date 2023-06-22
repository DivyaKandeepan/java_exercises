package cgi.stringmanipulation;

public class StringManipulation {
    public int vowelCount(String name) {
        int count = 0;
        String lowercaseName = name.toLowerCase();

        for (int i = 0; i < lowercaseName.length(); i++) {
            char ch = lowercaseName.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public int characterCount(String str) {
        return str.length();
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();

        String name = "Team";
        int vowelCount = stringManipulation.vowelCount(name);
        System.out.println("Vowel Count: " + vowelCount);

        String str = "Hello, World!";
        int characterCount = stringManipulation.characterCount(str);
        System.out.println("Character Count: " + characterCount);
    }
}

