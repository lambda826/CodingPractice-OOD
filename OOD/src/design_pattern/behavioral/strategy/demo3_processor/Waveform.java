/**
 *  @author  Yunxiang He
 *  @date    Feb 10, 2018 9:18:37 PM
 */

package design_pattern.behavioral.strategy.demo3_processor;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}
