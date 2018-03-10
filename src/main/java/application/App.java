package main.java.application;

import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import main.java.stationery.pencil.Pencil;
import main.java.stationery.straightedge.Straightedge;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static AbstractStationery[] setStationery(String stationery) {
        ArrayList stationeries = new ArrayList();
        Pattern pen = Pattern.compile("[Pp][Ee][Nn][,\\s$]");
        Matcher mpen = pen.matcher(stationery);
        while (mpen.find()) {
            stationeries.add(new Pen());
        }
        Pattern pencil = Pattern.compile("[Pp][Ee][Nn][Cc][Ii][Ll][,\\s$]");
        Matcher mpencil = pencil.matcher(stationery);
        while (mpencil.find()) {
            stationeries.add(new Pencil());
        }
        Pattern stredge = Pattern.compile("[Ss][Tt][Rr][Aa][Ii][Gg][Hh][Tt][Ee][Dd][Gg][Ee][,\\s$]");
        Matcher mstredge = stredge.matcher(stationery);
        while (mstredge.find()) {
            stationeries.add(new Straightedge());
        }
        AbstractStationery[] arrayStationeries = new AbstractStationery[stationeries.size()];
        for (int index = 0; index < arrayStationeries.length; index++) {

            arrayStationeries[index] = (AbstractStationery) stationeries.get(index);

        }
        stationeries.clear();

        return arrayStationeries;

    }


}
