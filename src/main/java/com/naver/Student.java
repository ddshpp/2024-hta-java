package com.naver;

public class Student {
    private final String name;
    private final int classNumber;
    private final int age;
    private final int height;

    public Student(String name, int classNumber, int age, int height) {
        this.name = name;
        this.classNumber = classNumber;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
