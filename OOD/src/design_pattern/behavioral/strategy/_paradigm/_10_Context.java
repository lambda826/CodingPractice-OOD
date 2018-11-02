/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 01:49
 */

package design_pattern.behavioral.strategy._paradigm;

public abstract class _10_Context {

    protected _00_IStrategy strategy;

    public _10_Context(_00_IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(_00_IStrategy strategy) {
        this.strategy = strategy;
    }

    public int performStrategy(int num1, int num2) {
        return 0;
    }

}
