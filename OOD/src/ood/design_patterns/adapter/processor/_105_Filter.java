package ood.design_patterns.adapter.processor;

public class _105_Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public _104_Waveform process(_104_Waveform input) {
        return input;
    }

}