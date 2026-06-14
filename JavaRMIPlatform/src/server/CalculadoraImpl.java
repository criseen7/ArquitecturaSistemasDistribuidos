package server;


import remote.Calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class CalculadoraImpl
extends UnicastRemoteObject
implements Calculadora {



    public CalculadoraImpl()
    throws RemoteException{

        super();

    }



    @Override
    public int sumar(
        int a,
        int b
    ){

        return a+b;
    }



    @Override
    public int restar(
        int a,
        int b
    ){

        return a-b;
    }



    @Override
    public int multiplicar(
        int a,
        int b
    ){

        return a*b;
    }




    @Override
    public double dividir(
        int a,
        int b
    ){

        if(b==0)
            throw new ArithmeticException(
                "Division por cero"
            );


        return (double)a/b;

    }

}