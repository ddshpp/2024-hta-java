package day3.management;

public class Company {

    public static void main(String[] args) {
        FullTimeWorker staff1 = new FullTimeWorker("흰수염", 77, "사우스블루");

        System.out.println("staff1.getCompany() : " + staff1.getCompany());
        System.out.println("staff1.TYPE_OF_WORK : " + staff1.TYPE_OF_WORK);

        staff1.createStaff();
        staff1.cashTherapy();
        staff1.getInfo();
    }
}
