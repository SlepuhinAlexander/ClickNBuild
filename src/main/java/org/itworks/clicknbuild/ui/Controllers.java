package org.itworks.clicknbuild.ui;

import java.util.concurrent.ConcurrentHashMap;

public final class Controllers {
    private static volatile Controllers inst;

    private final ConcurrentHashMap<Class<?>, Object> controllers;

    private Controllers() {
        controllers = new ConcurrentHashMap<>();
    }

    public static Controllers inst() {
        Controllers local = inst;
        if (local == null) {
            synchronized (Controllers.class) {
                local = inst;
                if (local == null) {
                    inst = local = new Controllers();
                }
            }
        }
        return local;
    }

    public static void register(Object object) {
        if (object == null) return;
        inst().controllers.put(object.getClass(), object);
    }

    public static Object get(Class<?> aClass) {
        return aClass == null ? null : inst().controllers.get(aClass);
    }
}
