import java.util.*;

public class pract_GPA_generator {

    public static void main(String[] args) {
        

        // asking input from the user {no.of courses}

        System.out.println("How many courses do you have in the semester: ");
        Scanner scan = new Scanner(System.in);

        int course = scan.nextInt();

        // creating an array for each courses

        double[] nocourses = new double[course];
        double sum = 0;

        // calculating avg

        for (int i = 0; i<nocourses.length; i++){

            System.out.println("Enter your average for the course " + (i+1)+ ": ");
            nocourses[1] = scan.nextDouble();
        }

        for (int i = 0; i<nocourses.length; i++){

            sum = sum + nocourses[i];
        }
        double avg = sum / nocourses.length;

        
        // based on generating pass of fail..
    }
    
}
