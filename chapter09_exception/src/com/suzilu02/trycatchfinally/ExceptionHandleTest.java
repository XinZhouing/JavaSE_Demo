package com.suzilu02.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author suzilu
 * @create 2024-10-11
 */
public class ExceptionHandleTest {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            //如果多个异常类型满足子父类的关系，则必须将子类声明在父类结构的上面。否则，报错。
            System.out.println("出现了RuntimeException异常！");
        }

        System.out.println("异常处理结束，代码继续执行...");
    }


}
