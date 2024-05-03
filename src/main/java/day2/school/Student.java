package day2.school;

public class Student {

    String name;
    int number;
    int age;
    int height;
    int weight;

    public Student(String name, int number, int age, int height, int weight) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void studentInfo() {
        System.out.println("이름 : " + name + "\n"
                + "학번 : " + number + "\n"
                + "나이 : " + age + "세\n"
                + "키 : " + height + "cm\n"
                + "몸무게 : " + weight + "kg \n"
        );
    }

    public void growth() {
        this.height += 10;
        this.weight += 10;
        System.out.println("[아이템사용] 맛있는 사탕을 1알 먹었다!!!\n\n"
                + name + " : 그라라라라!!!!!!!! \n"
                + "키 +10cm \n"
                + "몸무게 +10kg \n"
        );
    }

    public void strongGrowth() {
        this.height += 30;
        this.weight += 30;
        System.out.println("[아이템사용] 이상한 사탕을 1알 먹었다!!!\n\n"
                + name + " : 눼헤헤헤헤!!!!!!!!!!!! \n"
                + "키 +30cm \n"
                + "몸무게 +30kg \n"
        );
    }

    public void attack(Student opponent) {
        System.out.println(this.name + " [공격]\n" + this.name + "의 몸통박치기!!!!!!!");

        if (opponent.weight > this.weight) {
            System.out.println("뒤로 튕겨져 나간 " + this.name + "!!!");
        } else {
            System.out.println("말파이트궁에 맞은듯한 " + opponent.name + "!!!!!!!");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
