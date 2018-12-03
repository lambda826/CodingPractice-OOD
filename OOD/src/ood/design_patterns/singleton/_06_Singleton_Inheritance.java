package ood.design_patterns.singleton;

class Singleton {

    // All of your derived classes will share the same instance variable protected static Singleton instance;
    private static Singleton instance;

    // Change your constructor into public or protected
    protected Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class CoolerSingleton extends Singleton {

    // All of your derived classes will share the same instance variable
    protected static Singleton instance;

    private CoolerSingleton() {
        super();
    }
}

class HotterSingleton extends Singleton {

    private HotterSingleton() {
        super();
    }

}

public class _06_Singleton_Inheritance {

    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }

}
