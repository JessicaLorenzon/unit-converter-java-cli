package model.temperature;

import model.Unit;

public class Kelvin implements Unit {

    @Override
    public Double fromUnitBase(Double value) {
        return value + 273.15;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value - 273.15;
    }

    @Override
    public String unitText() {
        return "K";
    }
}
