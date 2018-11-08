/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.structural.adapter._paradigm.impl;

import ood.design_pattern.structural.adapter._paradigm.IAdaptee;

public class Adaptee implements IAdaptee {

    @Override
    public int method1() {
        return 1;
    }

    @Override
    public int method2() {
        return 2;
    }

}
