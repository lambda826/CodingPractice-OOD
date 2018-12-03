/**
 *  @author  Yunxiang He
 *  @date    2018-11-02 01:49
 */

package ood.design_patterns.behavioral.strategy._paradigm;

public abstract class _10_IContext {

    protected _00_IStrategy strategy;

    public _10_IContext(_00_IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(_00_IStrategy strategy) {
        this.strategy = strategy;
    }

    public int performStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
