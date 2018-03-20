package main.java.stationery.pencil;

import main.java.stationery.AbstractStationery;

public class Pencil extends AbstractStationery {

    private int cost;

    public Pencil(){
        this.cost = 3;
    }

    public Pencil(int cost) {
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
        Pencil other = (Pencil) obj;
        if (cost != other.cost)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int code = 12456754;
        int result = 5;
        result = code * result * cost;
        return result;
    }

    @Override
    public String getName() {
        return "Pencil";
    }

    @Override
    public String toString() {
        return String.format("Your stationery pencil with cost %d", cost);
    }
    @Override
    public int getCost() {
        return this.cost;
    }
}
