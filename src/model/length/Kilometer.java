package model.length;

import model.Unit;

public class Kilometer implements Unit {
    @Override
    public Double fromUnitBase(Double value) {
        return value / 100000;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value / 100000;
    }

    @Override
    public String unitText() {
        return "km";
    }
}
