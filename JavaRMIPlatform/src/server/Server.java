package server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args)
    throws Exception {
        // Crear registro RMI
        Registry registry =
            LocateRegistry.createRegistry(
                1099
            );

        CalculadoraImpl calculadora =
            new CalculadoraImpl();

        registry.rebind(
            "CalculadoraService",
            calculadora
        );

        System.out.println(
            "Servidor RMI iniciado..."
        );

    }
}