/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_patterns.structural.adapter._paradigm.impl;

import ood.design_patterns.structural.adapter._paradigm.ITarget;

public class Target implements ITarget {

    @Override
    public void method1() {
        System.out.println("TargetConcrete method1");
    }

    @Override
    public void method2() {
        System.out.println("TargetConcrete method2");
    }

}
