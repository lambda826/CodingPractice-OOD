/**
 *  @author  Yunxiang He
 *  @date    2018-10-22 21:09
 */

package ood.design_pattern.behavioral.template._paradiam;

public abstract class AbstractClassWithHook {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    final void concreteOperation() {
    }

    // We can also have concrete methods that do nothing by default; 
    // we call these "hooks" 
    // Subclasses are free to override these but don’t have to.
    void hook() {
    }

}
