package com.li.designpatterns.prototype;

/**
 * 被克隆的类，该类如果要调用Object类的clone()方法，必须实现Cloneable接口，否则会报CloneNotSupportedException的异常
 */
public class Police implements Cloneable{

    public String name;
    public Integer age;
    public Family family;

    /**
     * 深拷贝的实现方式一：重写父类Object类的clone()方法来实现
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这里完成对基本类型的拷贝
        Police police = (Police) super.clone();
        //对引用类型进行单独处理
        police.family = (Family) this.family.clone();
        return police;
    }

    @Override
    public String toString() {
        return "Police{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", family=" + family +
                '}';
    }
}
