package main.java.employee;

import main.java.stationery.AbstractStationery;

public class Employee {

    private AbstractStationery[] stationery;

    public Employee(AbstractStationery ... stationeries){

        this.stationery = stationeries;

    }
    public int getSumCost() {
        int sum = 0;
        for (int index = 0; index < stationery.length; index++) {
            sum += stationery[index].getCost();
        }
        return sum;
        }
    }