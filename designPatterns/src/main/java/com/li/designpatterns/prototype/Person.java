package com.li.designpatterns.prototype;


/**
 * 被克隆的类，该类如果要调用Object类的clone()方法，必须实现Cloneable接口，否则会报CloneNotSupportedException的异常
 */
public class Person implements Cloneable{

    public String name;
    public Integer age;
    public Boolean man;
    public Person friend;

    /**
     * 浅拷贝：即直接调用父类Object类的clone()方法即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", man=" + man +
                ", friend=" + friend +
                '}';
    }
}
