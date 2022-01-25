package com.hyman.asmtrace;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AdviceAdapter;


/**
 * AdviceAdapter是 MethodVisitor的子类，帮助我们修改方法体
 */
public class MyMethodVisitor extends AdviceAdapter {
    private MethodVisitor methodVisitor;

    protected MyMethodVisitor(int api, MethodVisitor mv, int access, String name, String desc) {
        super(api, mv, access, name, desc);
        methodVisitor = mv;
        System.out.println("name:" + name + " desc:" + desc);
    }


    /**
     * 拿到方法的注解
     *
     * @param desc
     * @param visible
     * @return
     */
    boolean calculate = false;

    /**
     * 方法退出时调用
     *
     * @param opcode
     */
    @Override
    protected void onMethodExit(int opcode) {
        super.onMethodExit(opcode);
        if (calculate) {
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
            methodVisitor.visitVarInsn(LSTORE, 3);

            methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
            methodVisitor.visitLdcInsn("\u8017\u65f6\uff1a");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            methodVisitor.visitVarInsn(LLOAD, 3);
            methodVisitor.visitVarInsn(LLOAD, 1);
            methodVisitor.visitInsn(LSUB);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        if (desc.contains("Calculate1")) {
            calculate = true;
        }
        System.out.println("visitAnnotation" + desc);
        return super.visitAnnotation(desc, visible);
    }

    /**
     * 方法进入时调用
     */
    @Override
    protected void onMethodEnter() {
        super.onMethodEnter();
        if (calculate) {
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
            methodVisitor.visitVarInsn(LSTORE, 1);
        }
    }
}
