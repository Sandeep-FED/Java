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

        System.out.println("Are you hungry Yes or No");

        String ans1 = sc.nextLine();

        if (ans1.equals("yes")){

            System.out.println("Choose what you want to eat between: Pizza, Burger or fish");

            String ans2 = sc.nextLine();

            while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){

                System.out.println("Sorry, you choosed wrong choice, we only have Pizza, Burger, Fish");

                ans2 = sc.nextLine();
            }

            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("pizza")){

                System.out.println("Do you something want to drink Yes or No?");
                String ans3 = sc.nextLine();
            
                while(!ans3.equals("yes") && !ans3.equals("no")){

                    System.out.println("Wrong input, make sure you entered Yes or No");
                    ans3 = sc.nextLine();
            }

            if(ans3.equals("yes")){
                System.out.println("What would you like to drink Coke or Miranda");

                String ans4 = sc.nextLine();
                while(!ans4.equals("coke") && !ans4.equals("miranda")){

                    System.out.println("Sorry, we dont have it. What would you like between coke & miranda");
                    ans4 = sc.nextLine();
                }
                if(ans4.equals("coke") && ans4.equals("miranda")){

                    System.out.println("Great !! you have ordered " +ans2+ " and " +ans4);
                }

                System.out.println("Confirm you password: ");
                pwdConfirm = sc.nextLine();

                while(!pwdConfirm.equals(pwd)){
                    System.out.println("Enter the correct password: ");

                    pwd = sc.nextLine();
                    
                }

                System.out.println("Thank you for you order, You will recieve the order");
            }


            }
        }
            else {

                System.out.println("Okay, Have a nice day!!");
            }
    }


}
