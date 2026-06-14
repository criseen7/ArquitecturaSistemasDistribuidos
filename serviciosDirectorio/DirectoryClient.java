import java.io.*;
import java.net.*;


public class DirectoryClient {


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
            "LOOKUP Calculadora"
        );


        String response =
            in.readLine();



        System.out.println(
            "Servidor encontrado:"
        );


        System.out.println(response);


        socket.close();

    }

}