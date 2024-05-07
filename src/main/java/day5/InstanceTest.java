package day5;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceTest that = (InstanceTest) o;
        return age == that.age && power == that.power && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, power);
    }
}
