package com.naver;

public class Student2 extends Student {
    public Student2(String name, int classNumber, int age, int height) {
        super(name, classNumber, age, height);
    }

    public void studentInfo() {
        System.out.println(getName());
        System.out.println(getClassNumber());
        System.out.println(getAge());
        System.out.println(getHeight());
    }
}
