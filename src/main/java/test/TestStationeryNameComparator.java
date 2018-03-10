package main.java.test;

import main.java.comparator.StationeryNameComparator;
import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import main.java.stationery.straightedge.Straightedge;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class TestStationeryNameComparator {

    StationeryNameComparator comp;
    ArrayList<AbstractStationery> array;

    @Before
    public void setUp() {
        comp = new StationeryNameComparator();
        array = new ArrayList<>();
        array.add(new Straightedge());
        array.add(new Pen());

    }

    @Test
    public void testForCompareByName(){
        Collections.sort(array, comp);
        assertEquals(array.get(0).getName(),"Pen");
    }

}
