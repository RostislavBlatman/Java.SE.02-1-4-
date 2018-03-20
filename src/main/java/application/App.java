package main.java.application;

import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import main.java.stationery.pencil.Pencil;
import main.java.stationery.straightedge.Straightedge;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static AbstractStationery[] setStationery(String stationery) {
        List<AbstractStationery> stationeries = new ArrayList<>();
        String[] adaptedString = stationery.replaceAll(" ", "").toLowerCase().split(",");
        for (String str : adaptedString) {
            switch (str) {
                case "pen":
                    stationeries.add(new Pen());
                    break;
                case "pencil":
                    stationeries.add(new Pencil());
                    break;
                case "straightedge":
                    stationeries.add(new Straightedge());
                    break;
            }
        }
        AbstractStationery[] arrayStationeries = new AbstractStationery[stationeries.size()];
        for (int index = 0; index < arrayStationeries.length; index++) {

            arrayStationeries[index] = stationeries.get(index);

        }
        stationeries.clear();

        return arrayStationeries;

    }


}
