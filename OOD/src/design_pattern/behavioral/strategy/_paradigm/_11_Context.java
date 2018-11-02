/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:55:21 AM
 */

package design_pattern.behavioral.strategy._paradigm;

public class _11_Context extends _10_Context {

    public _11_Context(_00_IStrategy strategy) {
        super(strategy);
    }

    @Override
    public void setStrategy(_00_IStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int performStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
