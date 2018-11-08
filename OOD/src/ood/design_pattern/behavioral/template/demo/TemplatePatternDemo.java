/**
 *  @author  Yunxiang He
 *  @date    Feb 1, 2018 8:13:44 AM
 */

package ood.design_pattern.behavioral.template.demo;

public class TemplatePatternDemo {

    public static void main(String[] args) {

        _Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Footbal();
        game.play();

    }
}
