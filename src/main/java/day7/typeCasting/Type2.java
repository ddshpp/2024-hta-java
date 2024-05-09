package day7.typeCasting;

public class Type2 extends Type1 {
    int hp;
    int power;

    public Type2(String name, int age, int hp, int power) {
        super(name, age);
        this.hp = hp;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Type2{" +
                "hp=" + hp +
                ", power=" + power +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void testType2(){
        System.out.println("타입2");
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }
}
