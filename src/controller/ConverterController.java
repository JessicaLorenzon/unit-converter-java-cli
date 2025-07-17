package controller;

import model.*;
import service.ConverterService;
import view.View;

import java.util.Locale;
import java.util.Scanner;

public class ConverterController {
    private static final View view = new View();
    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        Locale.setDefault(Locale.US);

        try {
            Magnitude magnitude = getMagnitude();

            double value = getValue(magnitude);

            process(magnitude, value);
        } catch (IllegalArgumentException e) {
            view.displayInvalidEntry();
        }
        scanner.close();
    }

    private static Magnitude getMagnitude() {
        view.displayConverterHeader();

        int magnitudeChoice = scanner.nextInt();

        return switch (magnitudeChoice) {
            case 1 -> new MagnitudeLength();
            case 2 -> new MagnitudeWeight();
            case 3 -> new MagnitudeTemperature();
            default -> throw new IllegalArgumentException();
        };
    }

    private static double getValue(Magnitude magnitude) {
        view.displayEnterValue(magnitude.getUnitName());
        double value = scanner.nextDouble();

        if (value < 0 && !magnitude.allowNegativeValue()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    private static void process(Magnitude magnitude, double value) {
        view.displayEnterUnit("from", magnitude.getUnitList());
        int unitFrom = scanner.nextInt();
        Unit startUnit = magnitude.getUnit(unitFrom);

        view.displayEnterUnit("to", magnitude.getUnitList());
        int unitTo = scanner.nextInt();
        Unit finalUnit = magnitude.getUnit(unitTo);

        Double result = ConverterService.convert(startUnit, finalUnit, value);

        view.displayResultHeader();
        view.displayResult(value, startUnit.unitText(), result, finalUnit.unitText());
    }
}
