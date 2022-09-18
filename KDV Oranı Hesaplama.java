import java.util.Scanner;
public class FirstClass {
public static void  main(String[] args){
    double fiyat,kdvorani ;
    double kdvlifiyat,kdvtutari;
    Scanner input = new Scanner(System.in);
    System.out.print("Fiyat Giriniz: ");
    fiyat= input.nextDouble();
    boolean kosul = fiyat>=0&&fiyat<=1000;
    boolean kosul1=fiyat<0;
    boolean karar =  kosul==true;
    kdvorani=karar ? 0.18:0.08;
    kdvlifiyat=fiyat*(1+kdvorani);
    kdvtutari=fiyat*kdvorani;
    System.out.println("KDV Oranı: "+kdvorani);
    System.out.println("KDV'li Fiyat: "+kdvlifiyat);
    System.out.println("KDV Tutarı: "+kdvtutari);
}

}
