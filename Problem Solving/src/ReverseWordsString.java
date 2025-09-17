public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            reversed.append(" ");
        }
        System.out.println(reversed.toString().trim());
    }
}
