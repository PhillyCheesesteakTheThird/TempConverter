import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int value;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to convert from \nA) Celsius > Fahrenheit \nB) Fahrenheit > Celsius ");

        String selection = myObj.nextLine();  // Read user input
        if(selection.equals("A")  || selection.equals("a")) {
            System.out.println("Enter the Temperature(C) to be converted");
            value = myObj.nextInt();
            System.out.println();
        }
        else {
            System.out.println("Enter the Temperature(F) to be converted");
            value = myObj.nextInt();
            System.out.println( (selection * 5/9) + 32);


        }
    }
}

