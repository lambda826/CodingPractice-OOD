/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_patterns.adapter._paradigm;

import ood.design_patterns.adapter._paradigm.impl.Adaptee;
import ood.design_patterns.adapter._paradigm.impl.Target;
import ood.design_patterns.adapter._paradigm.impl._Adapter;

public class Client {

    public static void main(String[] args) {
        
        ITarget target = new Target();
        target.method1();
        target.method2();
        
        System.out.println();
        
        target = new _Adapter(new Adaptee());
        target.method1();
        target.method2();
    }
}
