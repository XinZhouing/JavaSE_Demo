package com.suzilu05.exer.exer3;

/**
 * Description:
 * 1.属性：名称（name）和生命值（LifeValue）
 * 2.提供setter和getter方法：
 *      在setLifeValve（int LifeValue）方法中，首先判断，如果 LifeValue为负数，
 *      就抛出NoLifeValue 异常信息为：生命值不能为负数：XX；
 *      然后再给成员LifeValve赋值。
 *3.提供空参构造
 *4.提供有参构造：使用setXxx方法给name 和LifeValve赋值
 */
public class Person {

    private String name;

    private Integer lifeValue;

    public Person(){

    }

    public Person(String name, Integer lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Integer lifeValue) {
        if (lifeValue < 0 ){
            throw new NoLifeValueException("生命值不能为负数:"+lifeValue);
        }
        this.lifeValue = lifeValue;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
