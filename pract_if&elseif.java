import java.util.*;
public class cars {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Do you want a car !!"); // 1st Question

        String Ans1 = scan.next(); // Storing the first question in Ans1..


        if (Ans1.equals("yes")){

            System.out.println("\n What is your fav color btwn -- Red -- Blue -- Yellow"); // 2nd Question..

            String Ans2 =scan.next(); // Storing the second question in Ans2..

            if (Ans2.equals("red")){

                System.out.println("You selected RED Color Car !!, confirm it again YES/NO");

                String Ans3 = scan.next();

                if (Ans3.equals("yes")){
                    System.out.println("You ordered RED car successfully, Let's check the Car !!");
                }
                else{
                    System.out.println("OK, No worries we'll check something else !!");
                }
            }
            else if (Ans2.equals("blue")){
                System.out.println("We can order");
            }
            else{
                System.out.println("We don't have that in stock !!");

            }
        }
        else{
            System.out.println("Okay !!, Wish you a great day");
        }
        scan.close();
    }
    
}
