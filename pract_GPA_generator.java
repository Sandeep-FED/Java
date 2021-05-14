import java.util.*;

public class pract_GPA_generator {

    public static void main(String[] args) {
        

        // asking input from the user {no.of courses}

        System.out.println("How many courses do you have in the semester: ");
        
        // getting the no.of courses from user
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        // creating an array for each courses

        double[] nocourses = new double[x]; //as we donno the array size tats why assigning it to user input
        double sum = 0;


        // the iteration should stop if i becomes greater than user input(courselength)
        for (int i = 0; i< nocourses.length; i++){

            System.out.println("Enter your average for the course " + (i+1)+ ": ");
            nocourses[i] = scan.nextDouble(); 
        }

        for (int i = 0; i<nocourses.length; i++){

            sum = sum + nocourses[i];
        }

                // calculating avg
        double avg = sum/nocourses.length;


        // transforming avg to grades..
        
        if (avg > 90) {
            System.out.println("You have A");
        }
        else if (avg >= 90  && avg > 80) {
            System.out.println("You have B");
        }
        else if (avg >= 80 && avg > 70 ) {
                System.out.println("You have C");
        }
        else if (avg >= 70 && avg > 60){
            System.out.println("You have D");
        }
        else if(avg< 60){
            System.out.println("You have failed ");
        }
        else{
            System.out.println("Try again!!");
        }
        }
    }
    
