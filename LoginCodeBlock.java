import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String username, password, answer,newpassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = inp.nextLine();
        System.out.print("Enter your password: ");
        password = inp.nextLine();
        if (username.equals("Patika") && password.equals("Java123")) {
            System.out.println("Successfully Logged in!");
        } else {
            System.out.println("Password is wrong! Do you want to enter new password? (Yes/No)");
        System.out.print("Please enter your answer:");
        answer = inp.nextLine();
            if (answer.equals("Yes")) {
                System.out.print("Enter your new password: ");
                newpassword = inp.nextLine();
                if (newpassword.equals("Java123")) {
                    System.out.println("New password can not be same with the old one. Please enter again!");
                }else {
                System.out.println("New password has been created successfully!");
                }

            } else  {
                System.out.println("Successfully logged out the system!");
            }
        }


    }
}


