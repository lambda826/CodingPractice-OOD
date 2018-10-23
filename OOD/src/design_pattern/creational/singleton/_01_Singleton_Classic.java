package design_pattern.creational.singleton;

// NOTE: This is not thread safe!
public class _01_Singleton_Classic {

    private static _01_Singleton_Classic uniqueInstance;

    // Other useful instance variables here

    private _01_Singleton_Classic() {
    }

    // Lazy instantiation
    // If we never need the instance, it never gets created
    public static _01_Singleton_Classic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new _01_Singleton_Classic();
        }
        return uniqueInstance;
    }

    // Other useful methods here
}
