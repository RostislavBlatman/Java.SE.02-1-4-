package test.java;

import main.java.application.App;
import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestApp {
    @Test
    public void setStationeryShouldReturnArrayOfStationery(){
        AbstractStationery[] array = new AbstractStationery[]{new Pen(), new Pen()};
        assertEquals(array[1], App.setStationery("Pen, Pen, ")[1]);
    }

}
