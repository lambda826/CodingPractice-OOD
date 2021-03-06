/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:25:13 PM
 */

package ood.design_patterns.behavioral.strategy.processor.usingInterfaceInsteadOfClass;

public interface Processor {
    String name();

    Object process(Object input);
}