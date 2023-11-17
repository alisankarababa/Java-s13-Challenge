package com.workintech.models;

import java.util.Arrays;

public class Employee {


    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String password, String email, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthPlan(int index, String name) {

        if(index < 0 || index > healthplans.length - 1 ) {

            System.out.println("addHealthPlan: index out of bounds");
            return;
        }

        if(null != healthplans[index]) {
            System.out.println("addHealthPlan: index " + index + " is not empty.");
            return;
        }

        if(null != name && Arrays.asList(healthplans).contains(name)) {
            System.out.println("healthplan already contains: " + name);
            return;
        }

        healthplans[index] = name;

    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }

}
