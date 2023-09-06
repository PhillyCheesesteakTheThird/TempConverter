public class TempConvert {
    public String convert(double inputInt, String typeSelection) {
        double value1;
        double value2;
        String output;
        //Uses the correct formula according to User selection
        if (typeSelection.equals("A")) {
             value1 = (inputInt * 9 / 5) + 32;
             value2 = inputInt + 273.15;
             //sets output as a string containing converted values
             output = (value1 + "°F " + "\n"+value2 +  "°K" );
        } else {
            value1 = (inputInt - 32) * 5/9;
            value2 = value1 + 273.15;
            output = (value1 + "°C " +"\n"+ value2 +  "°K" );

        }
        //Returns a String containing the converted values
        return output;
    }


}

