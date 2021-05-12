import java.util.*;

public class Scaneeer {
    public static void main(String[] args) {
        
        // accepting input from the user..
        String name;

        Double double_val;
        Scanner scan=new Scanner(System.in);

        name = scan.next();
        System.out.println(name);

        System.out.println('\n');

        double_val = scan.nextDouble();
        System.out.println(double_val);

        scan.close(); //to avoid memory leak..
    }
    
}