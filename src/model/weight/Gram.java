package model.weight;

import model.Unit;

public class Gram implements Unit {
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
        return "g";
    }
}
