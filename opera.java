import java.util.*;

public class opera {
    public static void main(String[] args) {

        // Checking whether numbers are equal or not !!
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n1 = sc.nextInt();
        System.out.println("Enter the number to check:");
        int n2 = sc.nextInt();
        System.out.println("Enter the number to check:");
        int n3 = sc.nextInt();

        boolean chec = n1 > n2 && n1 < n3;

        System.out.println(chec);



        sc.close();
    }
    
}
