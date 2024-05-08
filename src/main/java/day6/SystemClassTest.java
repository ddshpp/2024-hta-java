package day6;

public class SystemClassTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getenv("JAVA_VERSION"));
        System.out.println(System.getenv("JAVA_VM_VERSION"));
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv());
    }
}
