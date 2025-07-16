package controller;

import model.*;
import service.Converter;
import view.View;

import java.util.Locale;
import java.util.Scanner;

public class ConverterController {

    public void run() {
        Locale.setDefault(Locale.US);
        View view = new View();
        Scanner scanner = new Scanner(System.in);

        Magnitude magnitude = getMagnitude(view, scanner);

        double value = getValue(view, magnitude, scanner);

        process(view, magnitude, scanner, value);

        scanner.close();
    }

    private static Magnitude getMagnitude(View view, Scanner scanner) {
        while (true) {
            view.displayConverterHeader();

            if (!scanner.hasNextInt()) {
                view.displayInvalidEntry();
                scanner.next();
                continue;
            }

            int magnitudeChoice = scanner.nextInt();

            return switch (magnitudeChoice) {
                case 1 -> new MagnitudeLength();
                case 2 -> new MagnitudeWeight();
                case 3 -> new MagnitudeTemperature();
                default -> throw new IllegalArgumentException("Invalid entry: " + magnitudeChoice);
            };
        }
    }

    private static double getValue(View view, Magnitude magnitude, Scanner scanner) {
        while (true) {
            view.displayEnterValue(magnitude.getUnitName());

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                view.displayInvalidValue();
                scanner.next();
            }
        }
    }

    private static void process(View view, Magnitude magnitude, Scanner scanner, double value) {
        view.displayEnterUnit("from", magnitude.getUnitList());
        int unitFrom = scanner.nextInt();
        view.displayEnterUnit("to", magnitude.getUnitList());
        int unitTo = scanner.nextInt();

        Unit startUnit = magnitude.getUnit(unitFrom);
        Unit finalUnit = magnitude.getUnit(unitTo);

        Double result = Converter.converter(startUnit, finalUnit, value);

        view.displayResultHeader();
        view.displayResult(value, startUnit.unitText(), result, finalUnit.unitText());
    }
}
