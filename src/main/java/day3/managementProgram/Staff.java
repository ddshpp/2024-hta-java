package day3.managementProgram;

public class Staff {

    private final String company = "중앙HTA";
    private String name;
    private int age;
    private String address;
    private String typeOfWork;
    private int test001 = 1;

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
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

    public void hello() {
        System.out.println("[" + age + "세에 취업에 성공한 " + name + "]\n"
                + name + " : 엄마 저 합격했어요!!!!!!!!!!!!!!!!!!!\n");
    }

    public void test11() {
        System.out.println("오버라이딩 이전");
    }
}
