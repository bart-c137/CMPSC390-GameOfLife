package com.sxu.bart.unittest;

import com.sxu.bart.Wheel;

import static org.junit.jupiter.api.Assertions.*;

class WheelTest {
    private final Wheel wheel = new Wheel();
    private static final int MAX_SPIN = 10;
    private static final int MIN_SPIN = 1;

    @org.junit.jupiter.api.Test
    void spin() {
        int spinValue = wheel.spin();

        for(int i = 0; i < 1000; i++) {
            assertTrue(spinValue <= MAX_SPIN && spinValue >= MIN_SPIN,
                    "The number spun [" + spinValue + "] is outside the range of [" +
                            MIN_SPIN + ", " + MAX_SPIN + "].");
        }
    }
}