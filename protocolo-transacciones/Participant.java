public class Participant {

    private String name;
    private boolean prepared = false;
    private int balance = 1000;


    public Participant(String name){
        this.name = name;
    }


    public boolean prepare(int amount){

        System.out.println(
            name + " recibió PREPARE"
        );


        if(balance >= amount){

            prepared = true;

            System.out.println(
                name + " responde YES"
            );

            return true;
        }


        System.out.println(
            name + " responde NO"
        );

        return false;
    }



    public void commit(int amount){

        if(prepared){

            balance -= amount;

            System.out.println(
                name +
                " COMMIT aplicado. Saldo: "
                + balance
            );
        }
    }



    public void rollback(){

        prepared = false;

        System.out.println(
            name + " ROLLBACK"
        );
    }


    public int getBalance(){
        return balance;
    }
}