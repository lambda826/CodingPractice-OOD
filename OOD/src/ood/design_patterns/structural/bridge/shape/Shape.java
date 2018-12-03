/**
 *  @author: Yunxiang He
 *  @date  : 2018-11-03
 */

package ood.design_patterns.structural.bridge.shape;

public abstract class Shape {

    protected IDraw_Bridge drawAPI;

    protected Shape(IDraw_Bridge drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
