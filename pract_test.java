import java.util.*;
public class pract_test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Test!!");
        System.out.println("Q1: What is 2+2 in letters?");
        String ans1 = in.nextLine();

        while (!ans1.equals("four")){

            System.out.println("You had the wrong answer, Try again!! What is 2+2 in letters? ");
            ans1 = in.nextLine();
        }
        System.out.println("You had the right answer!!");

        System.out.println("Q2: What is the capital of Kerala?");
        String ans2 = in.nextLine();

        while(!ans2.equals("thiruvananthapuram")){

            System.out.println("you had the wrong answer, Try again !! :");
            ans2 = in.nextLine();
        }
        System.out.println("Great, You had the correct answer");

    }
    
}
