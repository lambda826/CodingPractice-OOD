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

public class _05_Enum_Singleton {

    public static void main(String[] args) {
        EnumBasedSingleton.INSTANCE.whateverMethod();
        EnumBasedSingleton.INSTANCE.getValue();

        System.out.println("****** Serialization problem, cannot serialize fields ******");
        EnumBasedSingleton singleton1 = EnumBasedSingleton.INSTANCE;
        String dirPath = "D:/01__Development/Coding Practice/OOD/OOD/src/ood/design_pattern/singleton/";
        String fileName = dirPath + "enumSingle.bin";
        //        singleton1.setValue(11);
        //        EnumBasedSingleton.save2File(singleton1, fileName);
        EnumBasedSingleton singleton2 = EnumBasedSingleton.readFromFile(fileName);
        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println("singleton1.getValue() : " + singleton1.getValue());
        System.out.println("singleton2.getValue() : " + singleton2.getValue());
    }
}

// Support auto seralization, protect from multiple instantiation
enum EnumBasedSingleton {

    INSTANCE;

    // Enum constructor default private
    EnumBasedSingleton() {
        value = 55;
    }

    private int value;

    public void whateverMethod() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void save2File(EnumBasedSingleton singleton, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName); ObjectOutput output = new ObjectOutputStream(fileOut)) {
            output.writeObject(singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EnumBasedSingleton readFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}