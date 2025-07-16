package model.length;

import model.Unit;

public class Centimeter implements Unit {
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
        return "cm";
    }
}
