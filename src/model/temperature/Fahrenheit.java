package model.temperature;

import model.Unit;

public class Fahrenheit implements Unit {

    @Override
    public Double fromUnitBase(Double value) {
        return value * 1.8 + 32;
    }

    @Override
    public Double toUnitBase(Double value) {
        return (value - 32) / 1.8;
    }

    @Override
    public String unitText() {
        return "°F";
    }
}
