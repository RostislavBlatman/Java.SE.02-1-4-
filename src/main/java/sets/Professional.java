package main.java.sets;

import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import main.java.stationery.pencil.Pencil;
import main.java.stationery.straightedge.Straightedge;

public class Professional implements SetsInterface {
    private AbstractStationery[] set;

    public Professional(){
        this.set = new AbstractStationery[]{new Pen(150), new Pen(30),new Pen(445) , new Pencil(100),
                new Straightedge(70), new Straightedge(570)};
    }

    public AbstractStationery[] getSet() {
        return set;
    }
    public String getName(){return "Professional set";}
}
