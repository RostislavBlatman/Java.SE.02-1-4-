package test.java;

import main.java.stationery.pen.Pen;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPen {
    private Pen pen;
    @Before
    public void setUp(){
        pen = new Pen();
    }
    @Test
    public void equalsShouldReturnTrue(){
        assertEquals(pen, new Pen());
    }
    @Test
    public void hashCodeShouldReturnTheSame(){
        assertEquals(pen.hashCode(), new Pen().hashCode());
    }
    @Test
    public void getCostShouldReturn25(){
        assertEquals(25, new Pen(25).getCost());
    }
}
