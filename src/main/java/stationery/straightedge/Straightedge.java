package main.java.stationery.straightedge;

import main.java.stationery.AbstractStationery;

public class Straightedge extends AbstractStationery {
    private int cost;

    public Straightedge(){
        this.cost = 10;
    }

    public Straightedge(int cost) {
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
        Straightedge other = (Straightedge) obj;
        if (cost != other.cost)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int code = 789545;
        int result = 78;
        result = code * result * cost;
        return result;
    }

    @Override
    public String getName() {
        return "Straightedge";
    }

    @Override
    public String toString() {
        return String.format("Your stationery straightedge with cost %d", cost);
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
