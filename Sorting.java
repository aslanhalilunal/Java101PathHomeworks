import java.util.Scanner;
public class Sorting {
    public static void  main(String[] args){
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the number a: ");
        a=input.nextInt();

        System.out.print("Please enter the number b: ");
        b=input.nextInt();

        System.out.print("Please enter the number c: ");
        c=input.nextInt();
        if ((a>b)&&(a>c)) {
            if (b>c){
                System.out.println("a>b>c");
            }else {
                System.out.print("a>c>b");
            }

        } else if ((b>a)&&(b>c)) {
           if (a>c) {
               System.out.println("b>a>c");
           }else {
               System.out.println("b>c>a");
           }
        }else {
            if (b>a) {
                System.out.print("c>b>a");
            }else {
                System.out.println("c>a>b");
            }
        }
    }
}
