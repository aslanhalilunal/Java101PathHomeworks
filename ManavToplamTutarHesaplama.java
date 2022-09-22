/* Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL
Örnek Çıktı;
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL */
import java.security.spec.ECGenParameterSpec;
import java.util.Scanner ;
public class FirstClass {
    public static void main(String[] args) {
        double total,apple,pear,tomato,banana,eggplant;
        Scanner input = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo?: ");
        apple=input.nextDouble();
        System.out.print("Armut Kaç Kilo?: ");
        pear=input.nextDouble();
        System.out.print("Domates Kaç Kilo?: ");
        tomato=input.nextDouble();
        System.out.print("Muz Kaç Kilo?: ");
        banana=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo?: ");
        eggplant =input.nextDouble();
        total=apple*3.67+pear*2.14+tomato*1.11+banana*0.95+eggplant*5;
        System.out.println("Toplam Tutar: " +total);




    }

}
