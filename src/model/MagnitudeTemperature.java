package model;

import model.temperature.Celsius;
import model.temperature.Fahrenheit;
import model.temperature.Kelvin;

public class MagnitudeTemperature implements Magnitude {
    @Override
    public Unit getUnit(Integer unitValue) {
        return switch (unitValue) {
            case 1 -> new Celsius();
            case 2 -> new Fahrenheit();
            case 3 -> new Kelvin();
            default -> throw new IllegalArgumentException("Invalid entry: " + unitValue);
        };
    }

    @Override
    public String getUnitName() {
        return "temperature";
    }

    @Override
    public String getUnitList() {
        return "[1.Celsius / 2.Fahrenheit / 3.Kelvin]";
    }

}
