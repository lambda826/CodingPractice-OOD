package design_pattern.creational.singleton;

public class _03_Singleton_Lazy_Instantiation {
    
    private static _03_Singleton_Lazy_Instantiation uniqueInstance;

    // Other useful instance variables here

    private _03_Singleton_Lazy_Instantiation() {
    }

    // synchronized
    // The only time synchronization is relevant is the first time through this method
    // Once we’ve set the uniqueInstance variable to an instance of Singleton, we have no further need to synchronize this method
    // After the first time through, synchronization is totally unneeded overhead!
    public static synchronized _03_Singleton_Lazy_Instantiation getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new _03_Singleton_Lazy_Instantiation();
        }
        return uniqueInstance;
    }

    // Other useful methods here
}
