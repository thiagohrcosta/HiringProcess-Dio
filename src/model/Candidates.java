package model;

public class Candidates {
    private String name;
    private double salary;
    private int index;

    public Candidates(String name, double salary, int index) {
        this.name = name;
        this.salary = salary;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getIndex() {
        return index;
    }
}
