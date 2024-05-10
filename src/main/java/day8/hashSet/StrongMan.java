package day8.hashSet;

import java.util.Objects;

public class StrongMan {
    private String name;
    private int age;

    public StrongMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.age
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StrongMan strongMan)) {
            return false;
        }

        return (strongMan.getName() == this.name &&
                strongMan.getAge() == this.age);
    }
}
