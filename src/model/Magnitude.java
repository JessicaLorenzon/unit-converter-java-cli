package model;

public interface Magnitude {

    Unit getUnit(Integer unitValue);
    String getUnitName();
    String getUnitList();
}
