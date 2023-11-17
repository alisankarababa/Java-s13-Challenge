package com.workintech.models;

import java.util.Arrays;

public class Company {

    private int id;
    private String  name;
    private double giro;
    private String[] developerNames;

    private double correctedGiro(double giro) {
        return giro < 0 ? 0 : giro;
    }


    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = correctedGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = correctedGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if(index > developerNames.length - 1 ) {

            System.out.println("addEmployee: index out of bounds");
            return;
        }

        if(null != developerNames[index]) {
            System.out.println("addEmployee: index " + index + " is not empty.");
            return;
        }

        if(null != name && Arrays.asList(developerNames).contains(name)) {
            System.out.println("developerNames already contains: " + name);
            return;
        }

        developerNames[index] = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
