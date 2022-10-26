import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {
        int distance,age,discount,flighttype;
        double ticketprice=0,flighttypefactor;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the flight distance: ");
        distance=input.nextInt();
        System.out.print("Please enter the flight type (One way=1 , Round trip=2): ");
        flighttype= input.nextInt();
        System.out.print("Please enter your age: ");
        age=input.nextInt();
        if (flighttype==2) {
            flighttypefactor=0.80;
        }else {
            flighttypefactor=1;
        }
        if (distance<1||age<1||(flighttype<1||flighttype>2)){
            System.out.println("You entered invalid value!");
        }   else {
            if (age < 12) {
                ticketprice = 0.10 * distance * 0.5*flighttypefactor;
            } else if (age >= 12 && age < 24) {
                ticketprice = 0.10 * distance * 0.90*flighttypefactor;
            } else if (age > 65) {
                ticketprice = 0.10 * distance * 0.70*flighttypefactor;
            }  else {
                ticketprice = 0.10 * distance*flighttypefactor;
            }
        }
        System.out.println("Your total flight ticket price is "+ticketprice+" TL ");
    }
}
