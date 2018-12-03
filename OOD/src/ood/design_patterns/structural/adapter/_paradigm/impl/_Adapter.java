/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_patterns.structural.adapter._paradigm.impl;

import ood.design_patterns.structural.adapter._paradigm.ITarget;

public class _Adapter implements ITarget {

    private Adaptee adptee;

    public _Adapter(Adaptee adptee) {
        super();
        this.adptee = adptee;
    }

    @Override
    public void method1() {
        System.out.println("adptee   " + adptee.method1());
    }

    @Override
    public void method2() {
        System.out.println("adptee   " + adptee.method2());
    }

    public Adaptee getAdptee() {
        return adptee;
    }

    public void setAdptee(Adaptee adptee) {
        this.adptee = adptee;
    }

}
