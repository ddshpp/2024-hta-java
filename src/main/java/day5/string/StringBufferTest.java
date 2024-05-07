package day5.string;

public class StringBufferTest {
    public static void main(String[] args) {
        stringBufferTest01();
        stringBufferTest02();
    }

    private static void stringBufferTest01() {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(100);

        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        StringBuffer sb3 = sb2.append("999");
        System.out.println(sb3);
        //알고리즘에서 많이 사용했던 기억이 있음
    }

    private static void stringBufferTest02() {
        StringBuffer sb1 = new StringBuffer("01");
        StringBuffer sb2 = sb1.append(23);
        sb1.append('4').append(56);

        StringBuffer sb3 = sb1.append(78);
        sb3.append(9.0);

        System.out.println("sb1" + sb1);
        System.out.println("sb2" + sb2);
        System.out.println("sb3" + sb3);
    }
}