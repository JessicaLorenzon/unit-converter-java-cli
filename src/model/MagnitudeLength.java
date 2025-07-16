package model;

import model.length.Centimeter;
import model.length.Kilometer;
import model.length.Meter;
import model.length.Millimeter;

public class MagnitudeLength implements Magnitude {
    @Override
    public Unit getUnit(Integer unitValue) {
        return switch (unitValue) {
            case 1 -> new Millimeter();
            case 2 -> new Centimeter();
            case 3 -> new Meter();
            case 4 -> new Kilometer();
            default -> throw new IllegalArgumentException("Invalid entry: " + unitValue);
        };
    }

    @Override
    public String getUnitName() {
        return "length";
    }

    @Override
    public String getUnitList() {
        return "[1.Millimeter / 2.Centimeter / 3.Meter / 4.Kilometer]";
    }
}
