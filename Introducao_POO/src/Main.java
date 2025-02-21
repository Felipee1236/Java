public class Main {
    public static void main(String[] args){

        Conta conta = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();
        conta.titular = "Flip";
        conta2.titular = "Vitin";
        conta3.titular = "Chris";
        conta.depositar(50);
        conta.transferir(50, conta2);

        System.out.println(conta2.saldo);



    }
}