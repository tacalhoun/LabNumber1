import java.util.Scanner;

/**
 * Created by TACasey-Calhoun on 7/10/2017.
 */
public class LabNumber1 {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome!");

        double length;
        double width;

        System.out.println("Please enter length of the classroom:");
        length = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter width of the classroom:");
        width = scan.nextDouble();
        scan.nextLine();

        //processing

        double area = length * width;
        double perimeter = (2 *  (length + width));

        //output
        System.out.println("Length entered:  " + length);
        System.out.println("Width entered: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);



    }
}

