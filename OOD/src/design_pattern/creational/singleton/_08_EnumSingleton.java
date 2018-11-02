/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 03:58
 */

package design_pattern.creational.singleton;

public class _08_EnumSingleton {

    private _08_EnumSingleton() {
    }

    public static _08_EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        
        INSTANCE;

        private _08_EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton() {
            singleton = new _08_EnumSingleton();
        }

        public _08_EnumSingleton getInstance() {
            return singleton;
        }
    }
}
