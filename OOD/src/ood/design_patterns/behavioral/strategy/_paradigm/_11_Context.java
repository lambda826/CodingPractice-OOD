/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:55:21 AM
 */

package ood.design_patterns.behavioral.strategy._paradigm;

public class _11_Context extends _10_IContext {

    public _11_Context(_00_IStrategy strategy) {
        super(strategy);
    }

    @Override
    public void setStrategy(_00_IStrategy strategy) {
        this.strategy = strategy;
    }
    
}
