package model.length;

import model.Unit;

public class Millimeter implements Unit {
    @Override
    public Double fromUnitBase(Double value) {
        return value * 10;
    }

    @Override
    public Double toUnitBase(Double value) {
        return value / 10;
    }

    @Override
    public String unitText() {
        return "mm";
    }
}
