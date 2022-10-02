import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        int mat, phy, che, fic, mus;
        Scanner inp = new Scanner(System.in);

        System.out.print("Math score: ");
        mat = inp.nextInt();

        System.out.print("Physic score: ");
        phy = inp.nextInt();

        System.out.print("Chemistry score: ");
        che = inp.nextInt();

        System.out.print("Fiction score: ");
        fic = inp.nextInt();

        System.out.print("Music score: ");
        mus = inp.nextInt();
        int ma=1,ph=1,ch=1,fi=1,mu=1;
        if (mat < 0 || mat > 100)  {
              ma=0;
        }
            if ((phy < 0 || phy > 100)) {
                ph=0;
            }
            if ((che < 0 || che > 100)) {
                ch = 0;
            }
            if ((fic < 0 || fic > 100)) {
                fi=0;
            }
            if (mus < 0 || mus > 100) {
                mu = 0;
            }
        int division= (ma+ph+ch+fi+mu);
        float   average=((mat*ma+ phy*ph + che*ch + fic*fi + mus*mu)/division);
            if (average < 55) {
                System.out.println("You failed the class! See You next year!");
            } else {
                System.out.println("Congratulations! You passed the class!");
            }
        System.out.println("Your average score is: " + average);
        }

    }
