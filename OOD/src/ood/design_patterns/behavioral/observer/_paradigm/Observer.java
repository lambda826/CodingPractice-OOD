/**
 *  @author Yunxiang He
 *  @date   2018-11-02 04:25
 */

package ood.design_patterns.behavioral.observer._paradigm;

public class Observer implements IObserver {

    private int _field1;
    private int _field2;
    private ISubject subject;

    public Observer(ISubject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    public void update(int field1, int field2) {
        _field1 = field1;
        _field2 = field2;
        System.out.println(_field1 + "  " + _field2);
    }

    public int get_field1() {
        return _field1;
    }

    public void set_field1(int _field1) {
        this._field1 = _field1;
    }

    public int get_field2() {
        return _field2;
    }

    public void set_field2(int _field2) {
        this._field2 = _field2;
    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer(subject);

        subject.setField1(1);
        subject.setField2(2);
        subject.notifyObservers();

        observer.unSubscribe(subject);

        subject.setField1(3);
        subject.setField2(4);
        subject.notifyObservers();

        observer.getSubject().subscribe(observer);
        subject.notifyObservers();
    }

}
