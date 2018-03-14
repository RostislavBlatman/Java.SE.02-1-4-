package main.java.employee;

import main.java.stationery.AbstractStationery;

public class Employee {

    private AbstractStationery[] stationery;

    public Employee(AbstractStationery ... stationeries){

        this.stationery = stationeries;

    }
    public int getSumCost() {
        int sum = 0;
        for (AbstractStationery cost : stationery) {
            sum += cost.getCost();
        }
        return sum;
        }
    }