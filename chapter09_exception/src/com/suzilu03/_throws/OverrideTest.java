package com.suzilu03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写时抛出异常的规则
 */
public class OverrideTest {

    class Father{
        public void method1() throws IOException {

        }
    }

    class Son extends Father{

        //子类重写的方法可以与父类被重写的方法相同或是父类被重写方法抛出异常的子类（针对编译时异常）
        @Override
        public void method1() throws FileNotFoundException {
        }
    }
}
