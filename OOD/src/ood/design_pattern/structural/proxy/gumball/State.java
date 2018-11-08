package ood.design_pattern.structural.proxy.gumball;

import java.io.*;

public interface State extends Serializable {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
