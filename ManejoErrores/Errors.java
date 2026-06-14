import java.io.*;
import java.util.logging.Logger;

public class Archivo {
    public void leer()
    throws IOException {
        FileReader file =
            new FileReader(
                "archivo.txt"
            )
    }
}

class Cuenta {


private int saldo = 100;


public void retirar(int cantidad)
    throws SaldoInsuficienteException{
        if(cantidad > saldo){

            throw new SaldoInsuficienteException(
                "Saldo insuficiente"
            );

        }
        saldo -= cantidad;

    }

}

public class Banco {


    public void retirar(int dinero){
        if(dinero > 1000){

            throw new RuntimeException(
                "Cantidad no permitida"
            );
        }

        System.out.println(
            "Retiro realizado"
        );
    }

}

public class Main {
    public static void main(String[] args){
        try {
        System.out.println(
            "Proceso"
        );

        Logger log = Logger.getLogger("Sistema");

        log.warning(
            "Error de conexión"
        );

        }
        catch(Exception e){

            System.out.println(
                "Error"
            );

        }
        finally{
            System.out.println(
                "Finalizado"
            );
    }
    
}