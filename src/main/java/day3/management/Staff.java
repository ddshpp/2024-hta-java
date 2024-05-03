package day3.management;

public class Staff {

    private String company = "중앙HTA";
    private String name;
    private int age;
    private String address;
    private String typeOfWork;
    private final int TEST_NUMBER = 1;

    public void createStaff() {
        System.out.println("[" + age + "세에 취업에 성공한 " + name + "]\n"
                + name + " : 엄마 저 합격했어요!!!!!!!!!!!!!!!!!!!\n");
    }

    public void overrideTest() {
        System.out.println("오버라이딩 이전");
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }


}
