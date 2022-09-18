import java.util.Scanner;
public class FirstClass {
public static void  main(String[] args){
    int mat, fiz, kim,tur,tar,muz;
    Scanner input = new Scanner(System.in);
    System.out.print("Matematik Notunu Giriniz: ");
    mat= input.nextInt();
    System.out.print("Fizik Notunu Giriniz: ");
    fiz= input.nextInt();
    System.out.print("Kimya Notunu Giriniz: ");
    kim= input.nextInt();
    System.out.print("Türkçe Notunu Giriniz: ");
    tur= input.nextInt();
    System.out.print("Tarih Notunu Giriniz: ");
    tar= input.nextInt();
    System.out.print("Müzik Notunu Giriniz: ");
    muz= input.nextInt();
    int toplam=(mat+fiz+kim+tur+tar+muz);
    double bolen=6.0;
    double ortalama= toplam/bolen;
            System.out.println("Ortalamanız: "+ ortalama);
            boolean karar = ortalama>60;
            String str = karar ? "Sınıfı Geçti" : "Sınıfta Kaldı";
    System.out.println(str);
}

}
