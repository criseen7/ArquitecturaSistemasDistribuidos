import java.util.Arrays;


public class Main {


    public static void main(String[] args){


        Participant bancoA =
            new Participant("Banco A");


        Participant bancoB =
            new Participant("Banco B");



        Coordinator coordinator =
            new Coordinator(
                Arrays.asList(
                    bancoA,
                    bancoB
                )
            );



        coordinator.executeTransaction(500);

    }
}