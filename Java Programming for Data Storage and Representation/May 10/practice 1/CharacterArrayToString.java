public class CharacterArrayToString {
    public static void main(String[] args) {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o'};

        String str = String.valueOf(charArray);

        System.out.println("Original character array: " + String.valueOf(charArray));
        System.out.println("Created string object: " + str);
    }
}
