/**
 *  @author  Yunxiang He
 *  @date    Feb 4, 2018 5:56:30 AM
 */

package design_pattern.behavioral.strategy._paradigm;

public class _20_StrategyPatternDemo {

    public static void main(String[] args) {

        _11_Context context = new _11_Context(new _03_Stragegy_Add());
        System.out.println(context.performStrategy(5, 10));

        context = new _11_Context(new _01_Stragegy_Multiply());
        System.out.println(context.performStrategy(5, 10));

        context = new _11_Context(new _02_Stragegy_Substract());
        System.out.println(context.performStrategy(5, 10));

    }
}
