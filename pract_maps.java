import java.util.*;
import java.util.HashMap;

public class pract_maps {
    public static void main(String[] args) {

        Map cars = new HashMap();

        //adding elements inside maps
        cars.put("Bmw",3);
        cars.put("Audi",7);
        cars.put("Benz",4);
        cars.put("Volvo",100);
        cars.put("Jaguar",5);

        //removing elements from map
        cars.remove("Jaguar");

        //Searching an element in map based on key

        System.out.println(cars.get("Jaguar"));


        //to check the size of the car
        System.out.println(cars.size());
        
    }
    
}
