package com.xc.joy.netty.protocaltcp;

/**
 * @author lxcecho 909231497@qq.com
 * @since 12.12.2021
 *
 * 协议包
 */
public class MessageProtocol {

    private int len; // 关键

    private byte[] content;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
