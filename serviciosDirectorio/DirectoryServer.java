import java.io.*;
import java.net.*;
import java.util.*;


public class DirectoryServer {


    private static Map<String,String> services =
            new HashMap<>();


    public static void main(String[] args)
            throws Exception {


        ServerSocket server =
                new ServerSocket(8000);


        System.out.println(
            "Servicio de directorio activo..."
        );


        while(true){

            Socket client =
                server.accept();


            new Thread(
                () -> handle(client)
            ).start();
        }

    }



    public static void handle(Socket socket){

        try{


            BufferedReader input =
                new BufferedReader(
                    new InputStreamReader(
                        socket.getInputStream()
                    )
                );


            PrintWriter output =
                new PrintWriter(
                    socket.getOutputStream(),
                    true
                );


            String request =
                    input.readLine();



            String[] data =
                    request.split(" ");



            switch(data[0]){


                case "REGISTER":

                    services.put(
                        data[1],
                        data[2]
                    );


                    output.println(
                        "REGISTERED"
                    );

                    break;



                case "LOOKUP":

                    String result =
                        services.get(data[1]);


                    if(result == null)
                        output.println(
                            "NOT_FOUND"
                        );
                    else
                        output.println(result);


                    break;


                case "LIST":

                    output.println(
                        services.toString()
                    );

                    break;
            }


            socket.close();


        }catch(Exception e){

            e.printStackTrace();

        }
    }
}