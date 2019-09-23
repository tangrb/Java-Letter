package com.trb.java.letter.base;

import com.trb.java.letter.imp.LetterReader;
import com.trb.java.letter.imp.LetterWriter;

/**
 * author   唐荣兵
 * datetime 2019/9/23 15:16
 * email    yanhuang8923@163.com
 * mobile   186_7796_8417
 * <p>
 * Function description：
 */
public interface Letter {
    void read(LetterReader reader) throws Exception;

    void write(LetterWriter writer) throws Exception;
}
