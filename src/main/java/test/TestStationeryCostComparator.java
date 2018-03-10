package main.java.test;

import main.java.comparator.StationeryCostComparator;
import main.java.comparator.StationeryNameComparator;
import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class TestStationeryCostComparator {

    StationeryCostComparator comp;
    ArrayList<AbstractStationery> array;

    @Before
    public void setUp() {
        comp = new StationeryCostComparator();
        array = new ArrayList<>();
        array.add(new Pen(125));
        array.add(new Pen(1));

    }

    @Test
    public void testForCompareByCost(){
        Collections.sort(array, comp);
        assertEquals(array.get(0).getCost(),1);
    }
}
