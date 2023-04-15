package org.geeks;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    private int age;

    transient int passNo;

    private static final long serialVersionUID = 9876543456789L;

    static String standard ="1st class";

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passNo=" + passNo +
                '}';
    }

    public Person(String name, int age, int passNo) {
        this.name = name;
        this.age = age;
        this.passNo = passNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
