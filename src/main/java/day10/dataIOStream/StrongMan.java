package day10.dataIOStream;

import java.io.Serializable;

public class StrongMan implements Serializable {
    private String name;
    private int age;
    private int power;

    public StrongMan(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Power: " + power);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }
}
