/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:31:36 PM
 */

package design_pattern.structural.adapter.demo1_processor;

import design_pattern.behavioral.strategy.demo3_processor.BandPass;
import design_pattern.behavioral.strategy.demo3_processor.Filter;
import design_pattern.behavioral.strategy.demo3_processor.HighPass;
import design_pattern.behavioral.strategy.demo3_processor.LowPass;
import design_pattern.behavioral.strategy.demo3_processor.Waveform;
import design_pattern.behavioral.strategy.demo3_processor.usingInterfaceInsteadOfClass.Apply;
import design_pattern.behavioral.strategy.demo3_processor.usingInterfaceInsteadOfClass.Processor;

class FilterAdapter implements Processor {
    
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}