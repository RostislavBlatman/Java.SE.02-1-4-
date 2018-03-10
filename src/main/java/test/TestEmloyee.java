package main.java.test;

import main.java.employee.Employee;
import main.java.stationery.AbstractStationery;
import main.java.stationery.pen.Pen;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEmloyee {
    private Employee emp;
    @Before
    public void setUp() {
        AbstractStationery[] array = new AbstractStationery[]{new Pen(), new Pen()};
        emp = new Employee(array);
    }
    @Test
    public void getSumCostSouldReturnSummCostForAll(){
        assertEquals(40,emp.getSumCost());
    }
}
