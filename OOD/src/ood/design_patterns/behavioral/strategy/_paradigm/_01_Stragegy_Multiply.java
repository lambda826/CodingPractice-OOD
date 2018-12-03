/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:54:21 AM
 */

package ood.design_patterns.behavioral.strategy._paradigm;

public class _01_Stragegy_Multiply implements _00_IStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
