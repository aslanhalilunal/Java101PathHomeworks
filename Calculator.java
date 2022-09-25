import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2, select;
    Scanner input =new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2=input.nextInt();
        System.out.println("Hangi İşlemi Yapmak istersiniz?");
        System.out.println("Lütfen,Toplama işlemi yapmak için 1'e;");
        System.out.println("Çıkarma işlemi yapmak için 2'ye; ");
        System.out.println("Çarpma işlemi yapmak için 3'e; ");
        System.out.println("Bölme işlemi yapmak için 4'e basınız.");
        select= input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama işlemi seçtiniz.Sonuç aşağıdaki gibidir:");
                System.out.print(n1 +" + "+ n2 +" = "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi seçtiniz.Sonuç aşağıdaki gibidir:");
                System.out.print(n1 +" - "+ n2 +" = "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi seçtiniz.Sonuç aşağıdaki gibidir:");
                System.out.print(n1 +" * "+ n2 +" = "+(n1*n2));
                break;
            case 4:
                if (n2==0){
                    System.out.println("Bir Sayı 0'a bölünemez.Başka Bir sayı ile tekrar deneyiniz!");
                }else {
                    System.out.println("Bölme işlemi seçtiniz.Sonuç aşağıdaki gibidir:");
                    System.out.print(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                break;
            }

    }
}
