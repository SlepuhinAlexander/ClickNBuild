package org.itworks.clicknbuild.util.math;

import java.util.Date;
import java.util.Random;

public class MathHelper {
    private static final Random R = new Random(new Date().getTime());

    public static int clamp(int value, int min, int max) {
        if (max < min) throw new IllegalArgumentException(max + " cannot be less than " + min);
        return Math.min(Math.max(min, value), max);
    }

    public static int clamp(int value, int max) {
        return clamp(value, 0, max);
    }

    public static int clamp(int value) {
        return clamp(value, 0, Integer.MAX_VALUE);
    }

    public static long clamp(long value, long min, long max) {
        if (max < min) throw new IllegalArgumentException(max + " cannot be less than " + min);
        return Math.min(Math.max(min, value), max);
    }

    public static long clamp(long value, long max) {
        return clamp(value, 0, max);
    }

    public static long clamp(long value) {
        return clamp(value, 0, Long.MAX_VALUE);
    }

    public static float clamp(float value, float min, float max) {
        if (max < min) throw new IllegalArgumentException(max + " cannot be less than " + min);
        return Math.min(Math.max(min, value), max);
    }

    public static float clamp(float value, float max) {
        return clamp(value, 0f, max);
    }

    public static float clamp(float value) {
        return clamp(value, 0, Float.MAX_VALUE);
    }

    public static double clamp(double value, double min, double max) {
        if (max < min) throw new IllegalArgumentException(max + " cannot be less than " + min);
        return Math.min(Math.max(min, value), max);
    }

    public static double clamp(double value, double max) {
        return clamp(value, 0, max);
    }

    public static double clamp(double value) {
        return clamp(value, 0, Double.MAX_VALUE);
    }

    public static int randomInt(int bound) {
        return R.nextInt(bound);
    }
}
