package com.trb.java.letter.imp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/**
 * author   唐荣兵
 * datetime 2019/9/23 9:54
 * email    yanhuang8923@163.com
 * mobile   186_7796_8417
 * <p>
 * Function description：
 */
public class LetterReader extends DataInputStream {
    public LetterReader(byte[] buf) {
        this(new ByteArrayInputStream(buf));
    }

    public LetterReader(InputStream inputStream) {
        super(inputStream);
    }
}
