/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.structural.bridge.shape;

import ood.design_pattern.structural.bridge.shape.impl.CircleGreen;
import ood.design_pattern.structural.bridge.shape.impl.CircleRed;

public class BridgePatternDemo {
    
    public static void main(String[] args) {
        
        Shape redCircle = new Circle(100, 100, 10, new CircleRed());
        Shape greenCircle = new Circle(100, 100, 10, new CircleGreen());

        redCircle.draw();
        greenCircle.draw();
    }
}
