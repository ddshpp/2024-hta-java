package day8.arrayList;

public class StrongMan {
    private final String name;
    private final int age;
    private final int power;

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
