/**
 *  @author  Yunxiang He
 *  @date    2018-10-22 21:06
 */

package ood.design_patterns.behavioral.template._paradiam;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    final void concreteOperation() {
        // implementation here }
    }
}
