package day7.abstraction;

public class Application {
    public static void main(String[] args) {
        FullTimeStaff fullTimeStaff1 = new FullTimeStaff();
        PartTimeStaff partTimeStaff1 = new PartTimeStaff();

        fullTimeStaff1.hello();
        partTimeStaff1.hello();

        fullTimeStaff1.exitCompany();
        partTimeStaff1.exitCompany();
    }
}
