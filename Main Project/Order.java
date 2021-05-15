import java.util.*;
public class Order {
    public static void main(String[] args) {
        
        System.out.println("~~~ Welcome to the Food App ~~~");

        System.out.println("\t Create a Password: ");
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine(); // asking user input and storing it in pwd variable
        System.out.println("Password created successfully, Your current password is: " +pwd);

        // Password confirmation
        System.out.println("Enter the Password again: ");
        String pwdConfirm = sc.nextLine(); //storing the confirmed password tat the user going to enter in pwdConfirm variable

        // Using while loop checking the confirmed password is equals to the main password
        while(!pwdConfirm.equals(pwd)){
            System.out.println("The entered password is wrong, Please Try again!!:");
            pwdConfirm = sc.nextLine(); // if the user entered a wrong pass this line prompts the user to enter the pwd again
        }

        System.out.println("~~~ Access Granted ~~~");

        // Questions Begins....
        System.out.println("Are you hungry Yes or No");
        String ans1 = sc.nextLine(); // variable ans1 For storing the answer from the user

        if (ans1.equals("yes")){ //Checking if the user entered is yes.

            // if it is yes the following statement gets executed
            System.out.println("Choose what you want to eat between: Pizza, Burger or fish");
            String ans2 = sc.nextLine(); // var ans2 for storing the choices

            /* the while loop is used to check that if the user is entered within the choices...
             if its not the while loop gets executed until the user enter between the choices.. */
            while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){ 
                System.out.println("Sorry, you choosed wrong choice, we only have Pizza, Burger, Fish");
                ans2 = sc.nextLine(); // prompting the user to enter the correct answer
            }

            // Checking that the entered ans is one of pizza or burger or fish.. to ask another order
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")){
                System.out.println("Do you something want to drink Yes or No?");
                String ans3 = sc.nextLine(); // storing the answer in the ans3 variable
            

                // checking the answer is yes or no..rather than this producing and wrong input
                while(!ans3.equals("yes") && !ans3.equals("no")){
                    System.out.println("Wrong input, make sure you entered Yes or No");
                    ans3 = sc.nextLine(); //prompting the user to enter again the answer
            }

            if(ans3.equals("yes")){ //confirming ans3 = yes
                System.out.println("What would you like to drink Coke or Miranda"); //asking for another order
                String ans4 = sc.nextLine(); // storing the answer in ans4


                //now if the user enters anything other than coke and miranda it gonna show we dont have it.
                while(!ans4.equals("coke") && !ans4.equals("miranda")){ 
                    System.out.println("Sorry, we dont have it. What would you like between coke & miranda");
                    ans4 = sc.nextLine(); //prompting the user to give the input again
                }


                if(ans4.equals("coke") && ans4.equals("miranda")){ // if the ordered item matches the menu ..
                    System.out.println("Great !! you have ordered " +ans2+ " and " +ans4); // printing as order success
                }

                //prompting the user to enter the password again
                System.out.println("Confirm you password: ");
                pwdConfirm = sc.nextLine();

                // checking that the entered pwd not equals to the main pwd..
                while(!pwdConfirm.equals(pwd)){
                    System.out.println("Enter the correct password: ");
                    pwdConfirm = sc.nextLine(); // prompting the user to enter the pwd again
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
