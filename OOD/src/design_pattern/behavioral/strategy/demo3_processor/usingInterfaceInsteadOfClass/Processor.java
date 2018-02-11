/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:25:13 PM
 */

package design_pattern.behavioral.strategy.demo3_processor.usingInterfaceInsteadOfClass;

public interface Processor {
    String name();

    Object process(Object input);
}