/**
 *  @author Yunxiang He
 *  @date   12/02/2018
 */

package ood.design_patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class _01_Basic_Eager_Singleton implements Serializable {

    private static _01_Basic_Eager_Singleton INSTANCE = new _01_Basic_Eager_Singleton();

    private _01_Basic_Eager_Singleton() {
    }

    public static _01_Basic_Eager_Singleton getInstance() {
        return INSTANCE;
    }

    // Other fields and methods
    private int value;
    private static final long serialVersionUID = 1L;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void save2File(_01_Basic_Eager_Singleton singleton, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName); ObjectOutput output = new ObjectOutputStream(fileOut)) {
            output.writeObject(singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static _01_Basic_Eager_Singleton readFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (_01_Basic_Eager_Singleton) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Required for correct serialization
    // ReadResolve is used for _replacing_ the object read from the stream
    protected Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // BasicSingleton Demo
        System.out.println("****** BasicSingleton Demo ******");
        _01_Basic_Eager_Singleton singleton1 = _01_Basic_Eager_Singleton.getInstance();
        singleton1.setValue(11);
        _01_Basic_Eager_Singleton singleton2 = _01_Basic_Eager_Singleton.getInstance();
        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println("singleton1.getValue() : " + singleton1.getValue());
        System.out.println("singleton2.getValue() : " + singleton2.getValue());
        System.out.println();

        String dirPath = "D:/01__Development/Coding Practice/OOD/OOD/src/ood/design_pattern/singleton/";
        // Problem 1, Reflection
        System.out.println("****** Problem 1, Reflection ******");
        Class<_01_Basic_Eager_Singleton> clazz = _01_Basic_Eager_Singleton.class;
        Constructor<_01_Basic_Eager_Singleton> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        _01_Basic_Eager_Singleton singleton3 = constructor.newInstance(null);
        singleton3.setValue(33);
        _01_Basic_Eager_Singleton singleton4 = constructor.newInstance(null);
        System.out.println("singleton3 == singleton4 : " + (singleton3 == singleton4));
        System.out.println("singleton3.getValue() : " + singleton3.getValue());
        System.out.println("singleton4.getValue() : " + singleton4.getValue());
        System.out.println();

        // Problem 2, Serialization
        System.out.println("****** Problem 2, Serialization ******");
        String fileName = dirPath + "singleton.bin";
        _01_Basic_Eager_Singleton singleton5 = _01_Basic_Eager_Singleton.getInstance();
        singleton5.setValue(55);
        save2File(singleton5, fileName);
        singleton5.setValue(66);
        _01_Basic_Eager_Singleton singleton6 = readFromFile(fileName);
        System.out.println("singleton5 == singleton6 : " + (singleton5 == singleton6));
        System.out.println("Before serialization, singleton5.getValue() : " + singleton5.getValue());
        System.out.println("After serialization, singleton6.getValue() : " + singleton6.getValue());
    }
}
