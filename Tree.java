import java.util.Scanner;

public class Tree {

    private int height;
    private char myChar;

    //constructor that takes in a new height
    public Tree(int height) {
        if(height < 0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
        this.myChar = 'V';
    }


    //setter for myChar
    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }


    //grow method - takes in an amount of rain in millimeters (doubles)
    public void grow(double rain){
        if(rain >= 12){
            height++;
            System.out.println("We are growing!");
        }
    }


    //drawMe method - takes no parameters and returns nothing
    public void drawMe(){
        for(int i = 1; i <= height; i++)
        {
            for(int j = (height - i)/2; j > 0; j--)
            {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++)
            {
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}
