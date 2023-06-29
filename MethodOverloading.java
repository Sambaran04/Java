import javax.print.DocPrintJob;

public class Exercise {
    public static void main(String[] args) {
        double feet=6;
        double inch =13; 
        double cm = calcFeetAndInchesToCentimeters(feet,inch);
        if (cm != -1){
            System.out.println(feet + " feet and " + inch + " inches equals: "+ cm + " Cm.");
        }
        else
            System.out.println("It's not a valid input.");
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        double centimeter = 0.0;
        if (feet <0 || inch <0 || inch >12){
            return -1;
        }else if (feet==0 && inch >0){
            centimeter = inch* 2.54;
        }else if (feet >0 && inch == 0){
            centimeter = feet*12*2.54;
        }else if (feet >0 && inch >0 && inch <=12)
        {
            centimeter = feet*12.0*2.54+inch*2.54;
        }
    return centimeter;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0){
            return -1;
        }
        double feet = (int) inches/12;
        double remaininginches = (int) inches%12;
        System.out.println(inches + " is equal to "+ feet + " feet and " + remaininginches + " inches");
    return calcFeetAndInchesToCentimeters(feet, remaininginches);
    }
}