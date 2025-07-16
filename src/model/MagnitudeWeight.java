package model;

import model.weight.Gram;
import model.weight.Kilogram;
import model.weight.Milligram;

public class MagnitudeWeight implements Magnitude {
    @Override
    public Unit getUnit(Integer unitValue) {
        return switch (unitValue) {
            case 1 -> new Milligram();
            case 2 -> new Gram();
            case 3 -> new Kilogram();
            default -> throw new IllegalArgumentException("Invalid entry: " + unitValue);
        };
    }

    @Override
    public String getUnitName() {
        return "weight";
    }

    @Override
    public String getUnitList() {
        return "[1.Milligram / 2.Gram / 3.Kilogram]";
    }
}
