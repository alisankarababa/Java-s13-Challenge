package com.workintech.models;

public enum Plan {
    PLAN1("HMO", 100),
    PLAN2("PPO", 85),
    PLAN3("EPO", 65),
    PLAN4("POS", 45);

    private String name;
    private double price;

    Plan(String name, double price) {
        this.name = name;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "enumName='" + this.name() + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
