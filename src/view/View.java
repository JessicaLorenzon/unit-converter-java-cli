package view;

public class View {

    public void displayConverterHeader() {
        System.out.print("Choose the magnitude you want to convert? [1.Length / 2.Weight / 3.Temperature] ");
    }

    public void displayEnterValue(String unitName) {
        System.out.printf("Enter the %s to convert: ", unitName);
    }

    public void displayEnterUnit(String fromOrTo, String unitList) {
        System.out.printf("Unit to convert %s %s ", fromOrTo, unitList);
    }

    public void displayResultHeader() {
        System.out.println();
        System.out.println("Result of your calculation");
    }

    public void displayResult(Double value, String startUnit, Double result, String finalUnit) {
        System.out.printf("%.1f %s = %.1f %s", value, startUnit, result, finalUnit);
    }

    public void displayInvalidEntry() {
        System.err.println("Option out of allowed range. Try again!");
    }
}
