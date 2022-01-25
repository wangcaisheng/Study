package com.hyman.asmtrace;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ASMUnitTest {

    @Test
    public void test() throws IOException {
        //读取字节码
        FileInputStream inputStream = new FileInputStream(new File("src/test/java/com/hyman/composedemo/Tested.class"));
        //class分析器
        ClassReader classReader = new ClassReader(inputStream);
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        //执行字节码的分析与修改
        classReader.accept(new MyClassVisitor(Opcodes.ASM6, classWriter), ClassReader.EXPAND_FRAMES);
        //执行了插桩后的字节码数据
        byte[] bytes = classWriter.toByteArray();
        //覆盖原来的字节码
        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/com/hyman/composedemo/Tested.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /**
     * ClassVisitor访问的是类中的成员变量，方法（方法的修饰、返回、参数 不能修改方法体 MethodVisitor）
     */
    class MyClassVisitor extends ClassVisitor {
        public MyClassVisitor(int api, ClassVisitor classVisitor) {
            super(api, classVisitor);
        }

        /**
         * @param access
         * @param name
         * @param desc
         * @param signature
         * @param exceptions
         * @return
         */
        @Override
        public MyMethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            System.out.println(name);
            MethodVisitor methodVisitor = super.visitMethod(access, name, desc, signature, exceptions);
            MyMethodVisitor myMethodVisitor=new MyMethodVisitor(Opcodes.ASM6, methodVisitor, access, name, desc);
            return myMethodVisitor;
        }
    }


}
