package com.pauete.Unabstracting.operators;

public class BasicOperations {

    public static byte sumar(byte a, byte b) {
        return
                (a&b) << 1 != 0b0
                ? sumar((byte) (a^b), (byte) ((a&b) << 1))
                : (byte) (a^b);
    }

    public static byte restar(byte a, byte b) {
        return (byte) ~(
                sumar(
                        (byte) ~a,
                        b
                )
        );
    }

    public static byte multiplicar(byte a, byte b) {
        return
                b == 0
                ? b
                : sumar(a, multiplicar(a, restar(b, (byte) 0b1)));
    }

    public static byte dividir(byte a, byte b) {
        /*
        byte acc = 0b0;
        while (a >= b) {
            a = restar(a, b);
            acc = sumar(acc, (byte) 0b1);
        }
        */

        return
                b == 0
                ? 0b0
                : (byte) (0b0 + (
                            a >= b
                            ? sumar(dividir(restar(a, b), b), (byte) 0b1)
                            : (byte) 0b0
                        ));

    }

}
