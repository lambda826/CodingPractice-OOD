/**
 *  @author Yunxiang He
 *  @date   12/02/2018
 */

package ood.design_patterns.singleton;

public class _02_Lazy_Singleton {

    private static volatile _02_Lazy_Singleton instance;

    private _02_Lazy_Singleton() {
        System.out.println("Initialization a lazy singleton");
    }

    // Synchronized
    // The only time synchronization is relevant is the first time through this method
    // Once we’ve set the instance variable to an instance of Singleton, we have no further need to synchronize this method
    // After the first time through, synchronization is totally unneeded overhead!
    public static synchronized _02_Lazy_Singleton getInstance() {
        if (instance == null) {
            instance = new _02_Lazy_Singleton();
        }
        return instance;
    }

    // Double check locking
    // With double-checked locking, we first check to see if an instance is created, and if not, then we synchronize
    // We only synchronize the first time
    public static _02_Lazy_Singleton getInstance2() {
        if (instance == null) {
            synchronized (_02_Lazy_Singleton.class) {
                if (instance == null) {
                    instance = new _02_Lazy_Singleton();
                }
            }
        }
        return instance;
    }
}
