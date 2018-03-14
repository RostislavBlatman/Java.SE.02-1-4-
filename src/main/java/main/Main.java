package main.java.main;

import main.java.application.App;
import main.java.comparator.StationeryCostComparator;
import main.java.comparator.StationeryNameComparator;
import main.java.employee.Employee;
import main.java.sets.Professional;
import main.java.sets.SetsInterface;
import main.java.stationery.AbstractStationery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SetsInterface prof = new Professional();
        AbstractStationery[] profSet = prof.getSet();
        AbstractStationery[] stat = App.setStationery("pen, pencil, pencil, straightedge ");
        Employee emp = new Employee(stat);
        System.out.println("Amount cost of stationery for your employee = " + emp.getSumCost());
        StationeryNameComparator ncomp = new StationeryNameComparator();
        ArrayList<AbstractStationery> nameCompProfessional = new ArrayList<>();
        Collections.addAll(nameCompProfessional, profSet);
        Collections.sort(nameCompProfessional, ncomp);
        System.out.println("Professional set sorted by name: ");
        for (AbstractStationery a : nameCompProfessional) {
            System.out.println(a.getName() + " : " + a.getCost());
        }
        StationeryCostComparator ccomp = new StationeryCostComparator();
        TreeSet<AbstractStationery> costCompProfessional = new TreeSet<>(ccomp);
        Collections.addAll(costCompProfessional, profSet);
        System.out.println("Professional set sorted by cost: ");
        for (AbstractStationery a : costCompProfessional) {
            System.out.println(a.getName() + " : " + a.getCost());
        }
        Comparator<AbstractStationery> cncomp = new StationeryNameComparator().thenComparing(new StationeryCostComparator());
        TreeSet<AbstractStationery> nameCostCompProfessional = new TreeSet<>(cncomp);
        Collections.addAll(nameCostCompProfessional, profSet);
        System.out.println("Professional set sorted by name and cost: ");
        for (AbstractStationery a : nameCostCompProfessional) {
            System.out.println(a.getName() + " : " + a.getCost());
        }

    }
}
