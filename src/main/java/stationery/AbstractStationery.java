package main.java.stationery;

public abstract class AbstractStationery {

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();

    @Override
    public abstract int hashCode();

    public abstract String getName();

    public abstract int getCost();
}
