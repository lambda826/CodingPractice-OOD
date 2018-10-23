package design_pattern.creational.singleton;

public class _05_Singleton_Double_Checked_Locking {
    
    
    // The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it is being initialized to the Singleton instance
    private volatile static _05_Singleton_Double_Checked_Locking uniqueInstance;

    private _05_Singleton_Double_Checked_Locking() {
    }

    // With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize
    // We only synchronize the first time
    public static _05_Singleton_Double_Checked_Locking getInstance() {
        if (uniqueInstance == null) {
            synchronized (_05_Singleton_Double_Checked_Locking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new _05_Singleton_Double_Checked_Locking();
                }
            }
        }
        return uniqueInstance;
    }
}
