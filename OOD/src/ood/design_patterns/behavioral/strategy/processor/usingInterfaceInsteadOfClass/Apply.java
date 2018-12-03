/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:25:34 PM
 */

package ood.design_patterns.behavioral.strategy.processor.usingInterfaceInsteadOfClass;

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
