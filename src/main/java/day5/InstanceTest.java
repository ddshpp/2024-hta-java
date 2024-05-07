package day5;

public class InstanceTest {

    private String name;
    private int age;
    private int power;

    public InstanceTest(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    @Override
    public String toString() {
        return "InstanceTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", power=" + power +
                '}';
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
