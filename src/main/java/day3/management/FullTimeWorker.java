package day3.management;

public class FullTimeWorker extends Staff {

    final String TYPE_OF_WORK = "정규직";

    FullTimeWorker(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
        setTypeOfWork(TYPE_OF_WORK);
    }

    public void getInfo() {
        System.out.println("name : " + getName());
        System.out.println("age : " + getAge());
        System.out.println("address : " + getAddress());
        System.out.println("typeOfWork : " + getTypeOfWork());
    }

    @Override
    public void overrideTest() {
        System.out.println("오버라이딩 완료");
    }

    public void cashTherapy() {
        System.out.println("[통장에 월급이 들어왔다] \n"
                + getName() + " : 짬뽕시켜먹어야징!!!!!!!!\n");
    }
}
