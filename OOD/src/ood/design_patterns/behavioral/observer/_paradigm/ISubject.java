/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 04:16
 */

package ood.design_patterns.behavioral.observer._paradigm;

public interface ISubject {

    void subscribe(IObserver observer);

    void unSubscribe(IObserver observer);

    void notifyObservers();

}
