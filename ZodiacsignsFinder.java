import java.util.Scanner;
public class ZodiacSigns {
    public static void  main(String[] args) {
        int month,day;
        String zodiacsign="";
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the month: ");
        month=input.nextInt();
        System.out.print("Please enter the day: ");
        day=input.nextInt();
        if ((month == 1 && (day <= 21&&day>=1)) || (month == 12 && (day >= 23&&day<=31))) {
            zodiacsign = "Capricorn";
            } else if ((month == 2 && (day <= 20&&day>=1)) || (month == 1 && (day >= 22&&day<=31))) {
            zodiacsign = "Aquarius";
            }else if ((month == 3 && (day <= 19&&day>=1)) || (month == 2 && (day >= 21&&day<=29))) {
            zodiacsign = "Pisces";
            } else if ((month == 4 && (day <= 20&&day>=1)) || (month == 3 && (day >= 20&&day<=31))) {
            zodiacsign = "Aries";
            }else if ((month == 5 && (day <= 21&&day>=1)) || (month == 4 && (day >= 21&&day<=30))) {
            zodiacsign = "Taurus";
            }else if ((month == 6 && (day <= 22&&day>=1)) || (month == 5 && (day >= 22&&day<=31))) {
            zodiacsign = "Gemini";
            }else if ((month == 7 && (day <= 22&&day>=1)) || (month == 6 && (day >= 23&&day<=30))) {
            zodiacsign = "Cancer";
            }else if ((month == 8 && (day <= 22&&day>=1)) || (month == 7 && (day >= 23&&day<=31))) {
            zodiacsign = "Leo";
            }else if ((month == 9 && (day <= 22&&day>=1)) || (month == 8 && (day >= 23&&day<=31))) {
            zodiacsign = "Virgo";
            }else if ((month == 10 && (day <= 22&&day>=1)) || (month == 9 && (day >= 23&&day<=30))) {
            zodiacsign = "Libra";
            }else if ((month == 11 && (day <= 22&&day>=1)) || (month == 10 && (day >= 23&&day<=31))) {
            zodiacsign = "Scorpius";
            }else if ((month == 12 && (day <= 22&&day>=1)) || (month == 11 && (day >= 23&&day<=30))) {
            zodiacsign = "Sagittarius";
            }
        if ((month>=1&&month<=12)&&(day>=1&&day<=31)){
            System.out.println("Your Zodiacsign is " + zodiacsign+"!");
            } else {
            System.out.println("You entered invalid day. Please enter a valid number!");
        }
    }
}
