import java.io.*;
import java.net.*;


public class ServiceProvider {


    public static void main(String[] args)
        throws Exception {


        Socket socket =
            new Socket(
                "localhost",
                8000
            );



        PrintWriter out =
            new PrintWriter(
                socket.getOutputStream(),
                true
            );



        BufferedReader in =
            new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()
                )
            );



        out.println(
            "REGISTER Calculadora localhost:9000"
        );


        System.out.println(
            in.readLine()
        );


        socket.close();

    }
}