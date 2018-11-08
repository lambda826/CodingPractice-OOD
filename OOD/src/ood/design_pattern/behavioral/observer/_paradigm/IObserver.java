/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 04:17
 */

package ood.design_pattern.behavioral.observer._paradigm;

public interface IObserver {

    void update(int field1, int field2);

    default void unSubscribe(ISubject subject) {
        subject.unSubscribe(this);
    }
}
