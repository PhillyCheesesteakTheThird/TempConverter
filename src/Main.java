import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates a new scanner object to read user responses
        Scanner myObj = new Scanner(System.in);
        //Creates a new TempConvert object from the class TempConvert
        TempConvert tempConvert = new TempConvert();
        //Prompts the user for a temperature conversion direction
        System.out.println("Which way are you converting?");
        System.out.println("A) Celsius > Fahrenheit \nB) Fahrenheit > Celsius");

        String response = myObj.nextLine();
        String typeSelection;
        double inputNum;
        //If user response A, the program uses the C>F conversion. Vice versa if B
        String unit;
        if (response.equalsIgnoreCase("A")){
            typeSelection = "A";
             unit = "°C";
            System.out.println("Enter the value (C) to be converted:");

        }
        else {
            typeSelection = "B";
            unit = "°Fahrenheit";
            System.out.println("Enter the value (F) to be converted:");


        }
        inputNum = myObj.nextDouble();
        //Print output

        System.out.println("Your input value: "+ inputNum +" "+ unit + "\nCalculates to: " + tempConvert.convert(inputNum, typeSelection) +" ");

    }
}