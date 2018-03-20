package main.java.sets;

import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import main.java.stationery.pencil.Pencil;
import main.java.stationery.straightedge.Straightedge;

public class Novice implements SetsInterface {
    private AbstractStationery[] set;

    public Novice(){
        this.set = new AbstractStationery[]{new Pen(15), new Pencil(2), new Straightedge(7)};
    }

    public AbstractStationery[] getSet() {
        return set;
    }
    public String getName(){return "Novice set";}
}
