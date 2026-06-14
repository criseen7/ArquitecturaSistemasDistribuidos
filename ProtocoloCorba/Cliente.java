import org.omg.CORBA.*;


public class Cliente {

    public static void main(String args[])
        throws Exception {



        ORB orb =
        ORB.init(args,null);



        org.omg.CORBA.Object obj =
        orb.resolve_initial_references(
        "NameService"
        );



        Calculadora calc =
        CalculadoraHelper.narrow(
        obj
        );



        System.out.println(
        calc.sumar(10,5)
        );


        System.out.println(
        calc.restar(10,5)
        );

    }

}