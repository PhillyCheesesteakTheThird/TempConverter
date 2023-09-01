import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        TempConvert tempConvert = new TempConvert();
        //Prompts the user for a temperature conversion direction
        System.out.println("Which way are you converting?");
        System.out.println("A) Celsius > Fahrenheit \nB) Fahrenheit > Celsius");

        String response = myObj.nextLine();
        String typeSelection;
        double inputNum;
        //If user response A, the program uses the C>F conversion. Vice versa if B
        if (response.equalsIgnoreCase("A")){
            typeSelection = "A";
            System.out.println("Enter the value (C) to be converted:");


        }
        else {
            typeSelection = "B";
            System.out.println("Enter the value (F) to be converted:");


        }
        inputNum = Double.parseDouble(myObj.nextLine());
        //Print output
        System.out.println(tempConvert.convert(inputNum, typeSelection));

    }
}