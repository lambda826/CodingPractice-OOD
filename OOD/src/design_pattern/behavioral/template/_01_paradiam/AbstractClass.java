/**
 *  @author  Yunxiang He
 *  @date    2018-10-22 21:06
 */

package design_pattern.behavioral.template._01_paradiam;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        // implementation here }
    }
}
