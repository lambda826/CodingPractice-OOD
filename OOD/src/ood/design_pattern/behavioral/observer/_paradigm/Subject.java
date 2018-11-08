/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 04:19
 */

package ood.design_pattern.behavioral.observer._paradigm;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    private List<IObserver> observers;
    private int field1;
    private int field2;

    public Subject() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unSubscribe(IObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(field1, field2);
        }
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver> observers) {
        this.observers = observers;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

}
