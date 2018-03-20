package main.java.comparator;

import main.java.stationery.AbstractStationery;

import java.util.Comparator;

public class StationeryCostComparator implements Comparator<AbstractStationery> {

    @Override
    public int compare(AbstractStationery stationery1, AbstractStationery stationery2) {
        if (stationery1.getCost() > stationery2.getCost()) {
            return 1;
        } else if (stationery1.getCost() < stationery2.getCost()) {
            return -1;
        } else {
            return 0;
        }
    }
}
