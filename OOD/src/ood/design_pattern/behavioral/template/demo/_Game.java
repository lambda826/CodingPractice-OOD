/**
 *  @author  Yunxiang He
 *  @date    Feb 1, 2018 8:10:43 AM
 */

package ood.design_pattern.behavioral.template.demo;

public abstract class _Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();
    
    public final void commonMethod() {
        System.out.println("Common");
    }
    
    public void hook() {
        System.out.println("hook");
    }

    public final void play() {
        initialize();
        startPlay();
        endPlay();
        commonMethod();
        hook();
    }
}
