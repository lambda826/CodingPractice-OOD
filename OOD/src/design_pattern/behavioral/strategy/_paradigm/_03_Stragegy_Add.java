/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:52:17 AM
 */

package design_pattern.behavioral.strategy._paradigm;

public class _03_Stragegy_Add implements _00_IStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
