public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber>0){
            int r=(columnNumber-1)%26;
            sb.append((char) (r+'A'));
            columnNumber = (columnNumber-1)/26;
        }
        return sb.reverse().toString();
    }
}
