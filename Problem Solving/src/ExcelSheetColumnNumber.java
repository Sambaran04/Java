public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "A";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        int answer=0;
        for (char c : columnTitle.toCharArray()){
            int d = c- 'A'+1;
            answer = answer*26 +d;
        }
        return answer;
    }
}
