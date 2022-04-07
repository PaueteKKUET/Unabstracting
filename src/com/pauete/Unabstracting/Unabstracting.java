package com.pauete.Unabstracting;

import com.pauete.Unabstracting.operators.BasicOperations;
import com.pauete.Unabstracting.operators.BinaryOperation;

public class Unabstracting {

    public static void main(String[] args) {

        byte a = (byte) 13;
        byte b = (byte) 5;
        BinaryOperation op = BasicOperations::dividir;

        byte result = op.operate(a, b);
        System.out.println(Byte.toUnsignedInt(a));
        System.out.println(Byte.toUnsignedInt(b));
        System.out.println(Byte.toUnsignedInt(result));
    }

}
