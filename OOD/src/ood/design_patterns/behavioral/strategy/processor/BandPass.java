/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:20:25 PM
 */

package ood.design_patterns.behavioral.strategy.processor;

/*



 */

public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
