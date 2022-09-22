/*      Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360 */
import java.util.Scanner ;
public class FirstClass {
    public static void main(String[] args) {
        int r;
        double pi,alan,cevre,alfa;
        pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Alfa Açısını Giriniz: ");
        alfa=input.nextDouble();
        alan=pi*r*r*alfa/360;
        cevre=2*pi*r;
        System.out.println("Dairenin Alanı " +alan+" birimkaredir.");




    }

}
