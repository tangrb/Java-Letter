package com.trb.java.letter.imp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/**
 * author   唐荣兵
 * datetime 2019/9/23 10:02
 * email    yanhuang8923@163.com
 * mobile   186_7796_8417
 * <p>
 * Function description：
 */
public class LetterWriter extends DataOutputStream {
    private ByteArrayOutputStream outs;

    public LetterWriter() {
        this(new ByteArrayOutputStream());
    }

    public LetterWriter(ByteArrayOutputStream outputStream) {
        super(outputStream);
        this.outs = outputStream;
    }

    public byte[] getByteArray() {
        return outs.toByteArray();
    }
}
