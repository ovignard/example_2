package com.example.javamavenjunithelloworld;

import java.io.PrintStream;


public class Hello {

    static final String HELLO = "Hello!";

    public static final int MAXIMUM_AMOUNT_OF_TIMES = 20;

    private int times = 1;

    
    public void setTimes(int times) {
        if (times < 0 || times > MAXIMUM_AMOUNT_OF_TIMES) {
            throw new IllegalArgumentException(String.format(
                    "Parameter «times» should be a positive number no larger than %d.",
                    MAXIMUM_AMOUNT_OF_TIMES
            ));
        }
        this.times = times;
    }

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    public void sayHello(PrintStream printer) {
        for (short i = 0; i < times; i++) {
            printer.println(HELLO);
        }
    }

}
