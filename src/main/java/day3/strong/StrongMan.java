package day3.strong;

public class StrongMan {

    String name;
    int level;
    int hp;
    int power;
    int speed;

    StrongMan(String name, int level, int hp, int power, int speed) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.power = power;
        this.speed = speed;
    }

    public void getInfo() {
        System.out.println(
                "이름 : " + this.name + "\n" + "레벨 : " + this.level + "\n" + "체력 : " + this.hp + "\n"
                        + "공격력: " + this.power + "\n" + "이동속도: " + this.speed + "\n");
    }
}
