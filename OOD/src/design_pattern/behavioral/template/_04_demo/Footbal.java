/**
 *  @author  Yunxiang He
 *  @date    Feb 1, 2018 8:13:03 AM
 */

package design_pattern.behavioral.template._04_demo;

public class Footbal extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

}
