package service;

import model.Unit;

public class Converter {

    public static Double converter(Unit startUnit, Unit finalUnit, double value) {

        Double valueConvertedToBase = startUnit.toUnitBase(value);
        Double baseConvertedToFinal = finalUnit.fromUnitBase(valueConvertedToBase);
        return baseConvertedToFinal;
    }
}

