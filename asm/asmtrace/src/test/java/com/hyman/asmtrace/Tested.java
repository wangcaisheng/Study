package com.hyman.asmtrace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在terminal 中 javac 生成字节码，在生成的字节码中插装
 */
class Tested {

    @Retention(RetentionPolicy.CLASS)
    @Target(ElementType.METHOD)
    public @interface Calculate1 {
    }

    @Calculate1
    public static void main(String[] args) throws InterruptedException{
        Thread.sleep(2000);
    }
}
