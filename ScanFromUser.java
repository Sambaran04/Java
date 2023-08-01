import java.util.Scanner;

public class ScanFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number: ");
            boolean isannum = scanner.hasNextInt();
            if(isannum){
                int number=scanner.nextInt();
                if(min>number){
                    min=number;
                }else if(max<number){
                    max=number;
                }
            }else{break;}
            scanner.nextLine();
        }
        System.out.println("The Minimum number is: "+min);
        System.out.println("The Maximum number is: "+max);
        scanner.close();
    }
}