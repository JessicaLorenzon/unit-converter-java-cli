package model.temperature;

import model.Unit;

public class Celsius implements Unit {

    @Override
    public Double fromUnitBase(Double value) {
        return value;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value;
    }

    @Override
    public String unitText() {
        return "°C";
    }
}
