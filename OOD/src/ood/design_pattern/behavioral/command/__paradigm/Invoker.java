/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.behavioral.command.__paradigm;

import java.util.List;

public class Invoker {

    private _ICommand command;
    private List<_ICommand> commands;

    public Invoker(List<_ICommand> commands, _ICommand command) {
        this.command = command;
        this.commands = commands;
    }

    public void invokeList() {
        for (_ICommand command : commands) {
            command.execute();
        }
    }

    public void invoke() {
        command.execute();
    }
}
