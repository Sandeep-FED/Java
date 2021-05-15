import java.util.*;
public class Order {
    public static void main(String[] args) {
        
        System.out.println("~~~ Welcome to the Food App ~~~");

        System.out.println("\t Create a Password: ");
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();

        System.out.println("Password created successfully: " +pwd);

        System.out.println("Enter the Password again: ");
        String pwdConfirm = sc.nextLine();

        while(!pwdConfirm.equals(pwd)){
            System.out.println("The entered password is wrong, Please Try again!!:");
            pwdConfirm = sc.nextLine();
        }

        System.out.println("~~~ Access Granted ~~~");


    }
    
}
