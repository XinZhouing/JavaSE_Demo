package com.suzilu04._throw;

public class ThrowTest {

    public static void main(String[] args){
        try{
            Student student = new Student();
            student.regist(-10);
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Student{
    int id;

    //手动抛出自定义异常对象
    public void regist(int id) throws BelowZeroException {
        if (id > 0){
            this.id = id;
        }else {
            throw new BelowZeroException("输入的ID非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
