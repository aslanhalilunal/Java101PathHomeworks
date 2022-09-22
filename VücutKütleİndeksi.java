/* Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)
Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173 */
import java.util.Scanner ;
public class FirstClass {
    public static void main(String[] args) {
        int kg;
        double boy,vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg=input.nextInt();
        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz: ");
        boy=input.nextDouble();
        vki = kg/(boy*boy);
        System.out.println("Vüct Kütle İndeksiniz: " +vki);




    }

}
