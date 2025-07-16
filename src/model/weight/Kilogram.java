package model.weight;

import model.Unit;

public class Kilogram implements Unit {
    @Override
    public Double fromUnitBase(Double value) {
        return value / 1000;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value * 1000;
    }

    @Override
    public String unitText() {
        return "kg";
    }
}
