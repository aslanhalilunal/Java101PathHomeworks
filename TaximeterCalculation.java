import java.util.Scanner;
public class FirstClass {
    public static void main(String[] args) {
        double km,total;
        boolean condition;
        Scanner input = new Scanner(System.in);
        System.out.print("How many Km did you go: ");
        km = input.nextDouble();
        total=2.2*km+10;
        condition= total>20;
        total= condition ? (2.2*km+10):20;
        System.out.print("Taxi Total Payment is " + total +" American Dollars.");



    }

}
