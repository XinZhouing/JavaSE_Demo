package com.suzilu05.exer.exer3;

/**
 * Description:
 * 1.使用满参构造方法创建Person对象，生命值传入一个负数
 * 由于一旦遇到异常，后面的代码的将不在执行，所以需要注释掉上面的代码
 * 2.使用空参构造创建Person对象
 * 调用setLifeValue（int lifeValue）方法，传入一个正数，运行程序
 * 调用setLifeValve（int LifeValue）方法，传入一个负数，运行程序
 *3.分别对①和②处理异常和不处理异常进行运行看效果
 */
public class Exer3 {
    public static void main(String[] args) {

        //使用有参构造器
        try{
            Person person = new Person("苏子路", -100);
            System.out.println(person);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }

        //使用空参构造器
        Person person2 = new Person();
        person2.setName("Jerry");
        person2.setLifeValue(10);
        System.out.println(person2);


    }
}
