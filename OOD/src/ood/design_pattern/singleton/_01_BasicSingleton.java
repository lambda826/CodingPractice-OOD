package ood.design_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class _01_BasicSingleton {

    private static _01_BasicSingleton INSTANCE = new _01_BasicSingleton();

    public static _01_BasicSingleton getInstance() {
        return INSTANCE;
    }

    // Other fields and methods
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        _01_BasicSingleton basicSingleton1 = _01_BasicSingleton.getInstance();
        basicSingleton1.setValue(11);
        _01_BasicSingleton basicSingleton2 = _01_BasicSingleton.getInstance();
        System.out.println(basicSingleton1.getValue());
        System.out.println(basicSingleton2.getValue());

        // Problem 1, Reflection
        Class<_01_BasicSingleton> clazz = _01_BasicSingleton.class;
        Constructor<_01_BasicSingleton> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        _01_BasicSingleton basicSingleton3 = constructor.newInstance(null);
        basicSingleton3.setValue(33);
        _01_BasicSingleton basicSingleton4 = constructor.newInstance(null);
        System.out.println(basicSingleton3.getValue());
        System.out.println(basicSingleton4.getValue());

        // Problem 2, Serialization

    }
}
