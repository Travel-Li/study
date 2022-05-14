package com.li.designpatterns.prototype;

public class PrototypeClient {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    /**
     * 浅拷贝测试
     * 总结：浅拷贝对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，
     * 也就是将该属性值复制一份给新的对象；对于数据类型是引用数据类型的成员变量，
     * 比如是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该
     * 成员变量的引值(内存地址)复制一份给新的对象，这样实际上两个对象的该成员变
     * 量都指向同一个实例。
     */
    static void test1(){
        Person person = new Person();
        person.name = "小王";
        person.age = 12;
        person.man = true;
        Person friend = new Person();
        friend.age = 13;
        friend.man = false;
        friend.name = "小芳";
        person.friend = friend;
        Person other = null;
        try {
            other = (Person)person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("原始人："+person);
        System.out.println("克隆人："+other);
        System.out.println(person.friend == other.friend);
        System.out.println(other == person);
    }

    /**
     * 深拷贝测试
     * 深拷贝：复制对象的所有基本数据类型的成员变量值；为所有引用数据类型的成员变量
     * 申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所
     * 有对象
     * 利用重写父类Object的clone()方法的方式实现深拷贝
     */
    static void test2(){
        Police police = new Police();
        police.age = 27;
        police.name = "小强";
        police.family = new Family("小李",25);
        Police otherPolice = null;
        try {
            otherPolice = (Police)police.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(police);
        System.out.println(otherPolice);
        System.out.println(police == otherPolice);
        System.out.println(police.family == otherPolice.family);

    }

}
