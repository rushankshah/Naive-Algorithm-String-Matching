public class NaiveStringMatchingAlgorithm {
    public static void main(String[] args) {
        String text = "ABAAABABCABA";
        String pattern = "ABA";
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            int temp = i;
            int j = 0;
            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(temp) != pattern.charAt(j))
                    break;
                else
                    temp++;
            }
            if ((j) == pattern.length())
                System.out.println("Pattern found at index " + i);
        }
    }
}