/**
 *  @author  Yunxiang He
 *  @date    Feb 1, 2018 8:11:57 AM
 */

package ood.design_patterns.behavioral.template.demo;

public class Cricket extends _Game {

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }

}
