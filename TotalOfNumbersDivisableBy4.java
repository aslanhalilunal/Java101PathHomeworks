import java.util.Scanner;
public class DoWhilePractice {
    public static void main(String[] args){
        int i,total=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            i= scan.nextInt();
            if (i%4==0){
                total+=i;
            }
        }while (i%2==0);
        System.out.println(total);
    }
}
