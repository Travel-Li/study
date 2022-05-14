package com.li.designpatterns.prototype;

public class Family implements Cloneable {

    public String name;
    public Integer age;

    public Family() {
    }

    public Family(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
