package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Calculadora
extends Remote {


    int sumar(
        int a,
        int b
    ) throws RemoteException;



    int restar(
        int a,
        int b
    ) throws RemoteException;



    int multiplicar(
        int a,
        int b
    ) throws RemoteException;



    double dividir(
        int a,
        int b
    ) throws RemoteException;

}