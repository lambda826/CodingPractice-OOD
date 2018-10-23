package design_pattern.creational.singleton;

class Singleton {

    // All of your derived classes will share the same instance variable
    //    protected static Singleton uniqueInstance;
    private static Singleton uniqueInstance;

    // Change your constructor so that it’s public or protected
    protected Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

class CoolerSingleton extends Singleton {

    // All of your derived classes will share the same instance variable
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }

}

class HotterSingleton extends Singleton {

    private HotterSingleton() {
        super();
    }

}

public class _06_SingletonTestDrive_Inheritance {

    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }

}
