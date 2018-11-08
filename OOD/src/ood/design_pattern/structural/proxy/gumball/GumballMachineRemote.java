package ood.design_pattern.structural.proxy.gumball;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
