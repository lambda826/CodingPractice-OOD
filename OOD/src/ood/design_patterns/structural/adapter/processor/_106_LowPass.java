package ood.design_patterns.structural.adapter.processor;

public class _106_LowPass extends _105_Filter {

    double cutoff;

    public _106_LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public _104_Waveform process(_104_Waveform input) {
        return input;
    }

}