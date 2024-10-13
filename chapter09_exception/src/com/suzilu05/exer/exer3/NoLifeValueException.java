package com.suzilu05.exer.exer3;

/**
 * Description:
 * （1） 自定义异常类NoLifeValveException继承RuntimeException
 * ①提供空参和有参构造
 * ②在有参构造中，需要调用父类的有参构造，把异常信息传入
 */
public class NoLifeValueException extends RuntimeException{

    static final long serialVersionUID = -3387516;

    public NoLifeValueException(){

    }

    public NoLifeValueException(String message){
        super(message);
    }

    public NoLifeValueException(String message,Throwable cause){
        super(message,cause);
    }
}
