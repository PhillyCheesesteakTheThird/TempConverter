public class TempConvert {
    public double convert(double inputInt, String typeSelection) {
        double output;
        //Uses the correct formula according to User selection
        if (typeSelection.equals("A")) {
            output = (inputInt * 9 / 5) + 32;
        } else {
            output = (inputInt - 32) * 5/9;

        }
        return output;
    }


}

