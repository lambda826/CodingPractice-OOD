/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:20:11 PM
 */

package ood.design_patterns.behavioral.strategy.processor;

/*



 */

public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
