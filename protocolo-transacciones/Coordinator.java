import java.util.List;


public class Coordinator {


    private List<Participant> participants;


    public Coordinator(
        List<Participant> participants
    ){

        this.participants = participants;
    }



    public void executeTransaction(int amount){


        System.out.println(
            "\n--- INICIANDO TRANSACCIÓN ---"
        );


        boolean allReady = true;



        // FASE 1: PREPARE

        for(Participant p : participants){

            boolean response =
                p.prepare(amount);


            if(!response){
                allReady=false;
            }
        }




        // FASE 2: DECISION

        if(allReady){


            System.out.println(
                "\nCOORDINADOR: COMMIT"
            );


            for(Participant p: participants){

                p.commit(amount);
            }


        }else{


            System.out.println(
                "\nCOORDINADOR: ROLLBACK"
            );


            for(Participant p: participants){

                p.rollback();
            }
        }
    }
}