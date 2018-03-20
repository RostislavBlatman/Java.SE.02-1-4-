package main.java.stationery.pen;

import main.java.stationery.AbstractStationery;


public class Pen extends AbstractStationery {

    private int cost;

    public Pen() {
        this.cost = 20;
    }

    public Pen(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pen other = (Pen) obj;
        if (cost != other.cost)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int code = 123;
        int result = 3;
        result = code * result * cost;
        return result;
    }

    @Override
    public String getName() {
        return "Pen";
    }

    @Override
    public String toString() {
        return String.format("Your stationery pen with cost %d", cost);
    }

    @Override
    public int getCost() {
        return this.cost;
    }


}
