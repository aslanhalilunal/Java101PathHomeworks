/*Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
import java.util.Scanner;
public class FirstClass {
    public static void main(String[] args) {
        double a, b, c, u, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("a Kenarının uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("b Kenarının uzunluğunu giriniz: ");
        b = input.nextDouble();
        System.out.print("b Kenarının uzunluğunu giriniz: ");
        c = input.nextDouble();
        u=(a+b+c)/2;
        alan = Math.ceil(Math.sqrt((u * (u-a) * (u-b) *(u-c))));
        System.out.print("Üçgenin Alanı: " + alan +" birimkaredir.");



    }

}
