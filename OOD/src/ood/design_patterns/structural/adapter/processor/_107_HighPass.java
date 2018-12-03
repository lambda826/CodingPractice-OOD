package ood.design_patterns.structural.adapter.processor;

public class _107_HighPass extends _105_Filter {

    double cutoff;

    public _107_HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public _104_Waveform process(_104_Waveform input) {
        return input;
    }

}