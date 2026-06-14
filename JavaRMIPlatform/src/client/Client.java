package client;
import remote.Calculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args)
    throws Exception {
        Registry registry =
            LocateRegistry.getRegistry(
                "localhost",
                1099
            );

        Calculadora calculadora =
            (Calculadora)
            registry.lookup(
                "CalculadoraService"
            );

        System.out.println(
            "Suma: "
            +
            calculadora.sumar(10,5)
        );

        System.out.println(
            "Resta: "
            +
            calculadora.restar(10,5)
        );

        System.out.println(
            "Multiplicación: "
            +
            calculadora.multiplicar(10,5)
        );

        System.out.println(
            "División: "
            +
            calculadora.dividir(10,5)
        );
    }
}