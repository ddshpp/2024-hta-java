package day7.typeCasting;

public class Type1 {
    String name;
    int age;

    public Type1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Type1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void testType1(){
        System.out.println("타입1");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
