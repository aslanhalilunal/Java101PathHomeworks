import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        int k, i,n=0,a=0;
        double m;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        i= input.nextInt();
        System.out.print("The numbers divisable by 3 and 4 are: ");
        for (k=1;k<=i;k++){
            if((k%3==0)&&(k%4==0)){
                a++;
                n+=k;
                System.out.print(k+",");
            }
        }
        m=n/a;
        System.out.println("");
        System.out.println("The sum of numbers divisable by 3 and 4 is: "+n);
        System.out.println("The number of numbers divisable by 3 and 4 is: "+a);
        System.out.println("The average of numbers divisable by 3 and 4 is: "+m);
    }
}
