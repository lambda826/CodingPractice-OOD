package design_pattern.structural.adapter.processor;

public class _110_Apply {

    public static void process(_109_Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

}
