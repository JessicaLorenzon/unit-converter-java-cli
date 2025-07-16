package model.length;

import model.Unit;

public class Meter implements Unit {
    @Override
    public Double fromUnitBase(Double value) {
        return value / 100;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value * 100;
    }

    @Override
    public String unitText() {
        return "m";
    }
}
