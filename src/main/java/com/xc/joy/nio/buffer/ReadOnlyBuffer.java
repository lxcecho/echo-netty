package com.xc.joy.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @author lxcecho 909231497@qq.com
 * @since 2021/2/20
 *
 * 可以将一个普通Buffer 转成只读 Buffer 。
 */
public class ReadOnlyBuffer {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(64);

        for (int i = 0; i < 64; i++) {
            byteBuffer.put((byte) i);
        }

        // 读取
        byteBuffer.flip();

        // 得到一个只读 Buffer
        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());

        // 读取
        while (readOnlyBuffer.hasRemaining()){
            System.out.print(readOnlyBuffer.get()+" ");
        }
        System.out.println();

        readOnlyBuffer.put((byte) 100);// 抛出 ReadOnlyBufferException 异常
    }
}
