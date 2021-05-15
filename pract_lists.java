import java.util.ArrayList;
public class pract_lists {
    public static void main(String[] args) {
        

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apples");
        fruits.add("pineapple");
        fruits.add("grapes");
        fruits.add("orange");
        int size = fruits.size();

        fruits.set(3,"green orange"); //modifying an existing element in list

        fruits.remove(1); //  to remove an specific element
        
        //fruits.clear(); to remove the entire list

        System.out.println(fruits);

       // String place = fruits.get(4);

        System.out.println(size);
        System.out.println(fruits.get(1)); //to get an element by specifying index..
    
    
    }
}
