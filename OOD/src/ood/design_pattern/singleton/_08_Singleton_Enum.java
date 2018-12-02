/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 03:58
 */

package ood.design_pattern.singleton;

public class _08_Singleton_Enum {

    private _08_Singleton_Enum() {
    }

    // Public access point
    public static _08_Singleton_Enum getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        
        INSTANCE;

        private _08_Singleton_Enum singleton;

        // Invoke only once
        private Singleton() {
            singleton = new _08_Singleton_Enum();
        }

        public _08_Singleton_Enum getInstance() {
            return singleton;
        }
    }
}
