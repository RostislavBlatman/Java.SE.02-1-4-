package main.java.comparator;

import main.java.stationery.AbstractStationery;

import java.util.Comparator;

public class StationeryNameComparator implements Comparator<AbstractStationery> {

    @Override
    public int compare(AbstractStationery stationery1, AbstractStationery stationery2) {
        return stationery1.getName().compareTo(stationery2.getName());
    }
}
