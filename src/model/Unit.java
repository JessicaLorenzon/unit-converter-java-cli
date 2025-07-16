package model;

public interface Unit {

    Double fromUnitBase(Double value);
    Double toUnitBase(Double value);
    String unitText();
}
