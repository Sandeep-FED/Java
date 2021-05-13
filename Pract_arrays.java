public class Pract_arrays{

    public static void main(String[] args) {
        
        double[] Data = new double[4]; //Array instantiate

        Data[0] = 1.0;
        Data[1] = 2.0;
        Data[2] = 3.0;
        Data[3] = 4.0;


        String[] Data2 = new String[2];

        Data2[0] = "Hello";

        Data2[1] = "World!!";

        System.out.println(Data2[0] + Data2[1]);

        if (Data[0] > Data[2]){

            System.out.println(Data[0] + " greater than" + Data[2]);
        }
        else {
            System.out.println(Data[2] + " greater than " + Data[0]);
        }




        


    }
}