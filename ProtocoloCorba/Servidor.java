import org.omg.CORBA.*;
import org.omg.PortableServer.*;


public class Servidor {

    public static void main(String args[])
        throws Exception {

            ORB orb =
                ORB.init(args,null);



            POA rootPOA =
                POAHelper.narrow(
                    orb.resolve_initial_references(
                        "RootPOA"
                    )
                );



            rootPOA.the_POAManager()
                    .activate();



            CalculadoraImpl objeto =
                new CalculadoraImpl();



            org.omg.CORBA.Object ref =
                rootPOA.servant_to_reference(
                    objeto
                );



            Calculadora calculadora =
                CalculadoraHelper.narrow(
                    ref
                );



            System.out.println(
                "Servidor CORBA activo"
            );

            orb.run();  

    }

}