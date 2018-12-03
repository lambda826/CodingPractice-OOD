/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:52:44 AM
 */

package ood.design_patterns.behavioral.strategy._paradigm;

public class _02_Stragegy_Substract implements _00_IStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
