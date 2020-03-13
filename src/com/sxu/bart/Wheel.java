package com.sxu.bart;

import java.util.Date;
import java.util.Random;

public class Wheel {
    private Random rng;

    public Wheel() {
        rng = new Random(new Date().getTime());
    }

    public int spin() {
        return rng.nextInt(10) + 1;
    }
}
