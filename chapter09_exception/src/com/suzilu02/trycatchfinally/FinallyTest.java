package com.suzilu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    @Test
    public void test1(){

        try{
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(10/0);//无论try或catch中是否存在异常或return语句，finally中声明的语句都会北执行
        }finally {
//            System.out.println(10/0);
            System.out.println("程序结束");
        }
    }


    /**
     *  finally在开发中的应用
     */
    @Test
    public void test2(){
        FileInputStream fis = null;
        try{
            File file = new File("D://hello.txt");

            fis = new FileInputStream(file);

            int data = fis.read();

            while (data != -1){
                System.out.println((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            //将流资源的关闭操作放在finally当中
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
