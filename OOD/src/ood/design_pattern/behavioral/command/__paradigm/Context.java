/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.behavioral.command.__paradigm;

public class Context {

    public static void main(String[] args) {
        _ICommand command = new Command1(new Model());
        Invoker invoker = new Invoker(null, command);
        invoker.invoke();
    }
}
