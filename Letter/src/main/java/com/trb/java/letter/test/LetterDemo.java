package com.trb.java.letter.test;

import com.trb.java.letter.base.Letter;
import com.trb.java.letter.imp.LetterReader;
import com.trb.java.letter.imp.LetterWriter;

/**
 * author   唐荣兵
 * datetime 2019/9/23 10:22
 * email    yanhuang8923@163.com
 * mobile   186_7796_8417
 * <p>
 * Function description：
 */
public class LetterDemo implements Letter {
    public boolean boolValue = true;
    public byte byteValue = Byte.MIN_VALUE;
    public short shortValue = Short.MIN_VALUE;
    public int intValue = Integer.MIN_VALUE;
    public long longValue = Long.MIN_VALUE;
    public char charValue = 'x';
    public float floatValue = 123.4f;
    public double doubleValue = 12345.678;
    public String stringValue = "" + hashCode();

    @Override
    public String toString() {
        return "LetterDemo{" +
                "boolValue=" + boolValue +
                ", byteValue=" + byteValue +
                ", shortValue=" + shortValue +
                ", intValue=" + intValue +
                ", longValue=" + longValue +
                ", charValue=" + charValue +
                ", floatValue=" + floatValue +
                ", doubleValue=" + doubleValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }

    @Override
    public void read(LetterReader reader) throws Exception {
        boolValue = reader.readBoolean();
        byteValue = reader.readByte();
        shortValue = reader.readShort();
        intValue = reader.readInt();
        longValue = reader.readLong();
        charValue = reader.readChar();
        floatValue = reader.readFloat();
        doubleValue = reader.readDouble();
        stringValue = reader.readUTF();
    }

    @Override
    public void write(LetterWriter writer) throws Exception {
        writer.writeBoolean(boolValue);
        writer.writeByte(byteValue);
        writer.writeShort(shortValue);
        writer.writeInt(intValue);
        writer.writeLong(longValue);
        writer.writeChar(charValue);
        writer.writeFloat(floatValue);
        writer.writeDouble(doubleValue);
        writer.writeUTF(stringValue);
    }
}
