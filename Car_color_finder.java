// To find different car colors..

public class Car_color_finder {
    public static void main(String[] args) {
        
    String[] Data = new String[5]; //creating string array with 5 elements

    Data[0] = "red";
    Data[1] = "blue";
    Data[2] = "yellow";
    Data[3] = "black";
    Data[4] = "blue";


    // for loop to stop if the i mets length of data..
    for (int i = 0; i<Data.length; i++){

        if (Data[i].equals("blue")){ //

            System.out.println("Car number " + i + " is blue");
        } else {

            System.out.println("Car number " + i + " is not blue");
        }
    }
        
    }

    
}
