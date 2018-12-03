/**
 *  @author Yunxiang He
 *  @date   12/02/2018
 */

package ood.design_patterns.singleton;

public class _04_Inner_Static_Singleton {

    private _04_Inner_Static_Singleton() {

    }

    // Avoid synchronization
    // Guerantees only one instance
    private static class Impl {
        private static final _04_Inner_Static_Singleton INSTANCE = new _04_Inner_Static_Singleton();
    }

    public static _04_Inner_Static_Singleton getInstantce() {
        return Impl.INSTANCE;
    }
}
