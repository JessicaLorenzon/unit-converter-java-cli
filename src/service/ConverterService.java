package service;

import model.Unit;

public class ConverterService {

    public static Double convert(Unit startUnit, Unit finalUnit, double value) {

        Double valueConvertedToBase = startUnit.toUnitBase(value);
        Double baseConvertedToFinal = finalUnit.fromUnitBase(valueConvertedToBase);
        return baseConvertedToFinal;
    }
}

