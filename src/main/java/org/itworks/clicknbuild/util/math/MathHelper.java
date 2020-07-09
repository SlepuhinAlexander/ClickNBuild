package org.itworks.clicknbuild.util.math;

import java.util.Date;
import java.util.Objects;
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

    public static int randomInt(int lower, int upper) {
        if (upper <= lower) throw new IllegalArgumentException();
        return R.nextInt(upper - lower) + lower;
    }

    public static double[] distribute(double amount, double[] jars) {
        Objects.requireNonNull(jars);
        for (double jar : jars) if (jar < 0d) throw new IllegalArgumentException();
        double[] result = new double[jars.length];
        if (amount <= 0d) return result;
        double sum = 0d;
        for (double jar : jars) sum += jar;
        if (amount >= sum) return jars.clone();
        boolean[] filled = new boolean[jars.length];
        int available = jars.length;
        double toDistribute;
        do {
            toDistribute = amount;
            for (double val : result) toDistribute -= val;
            double min = Double.MAX_VALUE;
            // find min jar that is not filled.
            for (int i = 0; i < jars.length; i++) if (!filled[i] && jars[i] < min) min = jars[i];
            // split evenly the rest amount toDistribute to all not filled
            double even = toDistribute / available;
            // if even split is less than minimal -> fill the not yet filled with even value and return;
            if (even <= min) {
                for (int i = 0; i < jars.length; i++) {
                    if (!filled[i]) result[i] = even;
                }
                return result;
            }
            // if even split is more than minimal jar -> fill to minimal; mark filled; recount not filled; proceed.
            for (int i = 0; i < jars.length; i++) {
                if (!filled[i] && jars[i] <= min) {
                    result[i] = min;
                    filled[i] = true;
                    available--;
                }
            }
        } while (toDistribute > 0d && available > 0d);
        return result;
    }
}
