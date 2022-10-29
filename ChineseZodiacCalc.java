import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class ChineseZodiacCalc {
    public static void main(String[] args){
        int birthday,zodiacnumber;
        String chinesezodiac="";
        //Dragon  Dog Ox Sheep Horse Snake Tiger Rabbit Monkey Rooster Rat Pig
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your birthday: ");
        birthday= input.nextInt();
        zodiacnumber=birthday % 12 ;
        switch (zodiacnumber){
            case 0:
                chinesezodiac="Monkey";
                break;
            case 1:
                chinesezodiac="Rooster";
                break;
            case 2:
                chinesezodiac="Dog";
                break;
            case 3:
                chinesezodiac="Pig";
                break;

            case 4:
                chinesezodiac="Rat";
                break;

            case 5:
                chinesezodiac="Ox";
                break;

            case 6:
                chinesezodiac="Tiger";
                break;

            case 7:
                chinesezodiac="Rabbit";
                break;

            case 8:
                chinesezodiac="Dragon";
                break;

            case 9:
                chinesezodiac="Snake";
                break;

            case 10:
                chinesezodiac="Horse";
                break;

            case 11:
                chinesezodiac="Sheep";
                break;

        }

        System.out.print("Your Chinese Zodiacsign is: "+chinesezodiac);

    }
}
