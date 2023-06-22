public class StringSequence {
    public static void main(String[] args) {
        String originalString = "string and stringbuffer exercises";
        String specifiedSequence = "and";

        boolean containsSequence = originalString.contains(specifiedSequence);

        System.out.println("Original string: " + originalString);
        System.out.println("Specified sequence: " + specifiedSequence);
        System.out.println("Contains specified sequence? " + containsSequence);
    }
}
