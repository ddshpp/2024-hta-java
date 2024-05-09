package day7.enumTest.enums;

public enum StrongMan {
    HO_DONG_KANG("강호동", 15000, 15000, "눼헤헿헤헤!!!!!"),
    DONG_HYUN_KIM("김동현", 13000, 17000, "맴ㅁ매매매맴!!!!!"),
    HYUN("현", 1000, 3000, "스카이!!!!!!!");

    private final String name;
    private final int power;
    private final int hp;
    private final String message;

    StrongMan(String name, int power, int hp, String message) {
        this.name = name;
        this.power = power;
        this.hp = hp;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public String getMessage() {
        return message;
    }
}
