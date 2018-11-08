/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.behavioral.command.__paradigm;

public class Command1 implements _ICommand {

    Model model;

    public Command1(Model model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.method1();
    }

}
