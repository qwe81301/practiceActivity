package com.exampletest4321;

import java.io.Serializable;

/**
 * author:       bearshih
 * project:      test
 * date:         2019/9/11
 * version:
 * description:
 */
public class Person implements Serializable {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
