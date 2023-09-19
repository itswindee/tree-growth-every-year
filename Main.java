import java.util.ArrayList;
import java.util.Random;

public class Main {

    //inchesToMM method
    public static double inchesToMM(double inches){
        return inches * 25.4;
    }


    //create last3YearInInches - takes in a number in an ArrayList of doubles
    public static double last3YearInInches(ArrayList<Double> rainfall){
        if(rainfall.size() < 3){
            return 100;
        }
        else
        {
            return (rainfall.get(rainfall.size()-3) + rainfall.get(rainfall.size()-2) + rainfall.get(rainfall.size()-1)) / 3;
        }
    }



    //create fire method - take in a true and an arraylist of doubles
    public static void fire(ArrayList<Double> rainfall, Tree t) {
        double averageRainfall = last3YearInInches(rainfall);
        if (averageRainfall < 0.5) {
            System.out.println("Oh no, we had a fire!");
            t.setMyChar('|');
        } else {
            t.setMyChar('V');
        }
    }


    //create inchesRain method - takes in an ArrayList od doubles
    public static double inchesRain(ArrayList<Double> rainfall){
        Random random = new Random();
        double num = random.nextDouble(2);
        rainfall.add(num);
        return num;
    }


    public static void main(String[] args) {
        Tree tree = new Tree(0);
        ArrayList<Double> rainfall = new ArrayList<Double>();

        for(int i = 1; i <= 20; i++){
            System.out.println("Year: " + i);
            double inchRain = inchesRain(rainfall);
            double MM = inchesToMM(inchRain);
            System.out.println("Rain this year: " + inchRain + " inches or " + MM + " mm.");
            tree.grow(MM);
            tree.drawMe();
            fire(rainfall, tree);
        }
    }
}
