/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:19:56 PM
 */

package ood.design_patterns.behavioral.strategy.processor;

/*



 */

public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }
}
