/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_pattern.structural.bridge.shape.impl;

import ood.design_pattern.structural.bridge.shape.IDraw_Bridge;

public class CircleGreen implements IDraw_Bridge {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

}
