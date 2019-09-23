package com.trb.java.letter.test;

import com.trb.java.letter.imp.LetterReader;
import com.trb.java.letter.imp.LetterWriter;

/**
 * author   唐荣兵
 * datetime 2019/9/23 10:20
 * email    yanhuang8923@163.com
 * mobile   186_7796_8417
 * <p>
 * Function description：
 */
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        //******************************************************************************************
        LetterDemo sendLetter = new LetterDemo();
        System.out.println(sendLetter);

        long writeTime = System.currentTimeMillis();
        try (LetterWriter writer = new LetterWriter()) {
            sendLetter.write(writer);


            long readTime = System.currentTimeMillis();
            try (LetterReader reader = new LetterReader(writer.getByteArray())) {
                LetterDemo receiveLetter = new LetterDemo();
                receiveLetter.read(reader);
                System.out.println(receiveLetter);
            } catch (Exception e) {
                e.printStackTrace();
            }

            readTime = System.currentTimeMillis() - readTime;
            System.out.println("readTime=" + readTime);

        } catch (Exception e) {
            e.printStackTrace();
        }

        writeTime = System.currentTimeMillis() - writeTime;
        System.out.println("writeTime=" + writeTime);


        //*****************************************************************************************


    }
}
