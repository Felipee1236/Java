public class Conta {
    float saldo;
    float limite;
    int cc;
    String titular;

    void sacar(float valor){
        saldo -= valor;

    }
    void depositar(float valor){
        saldo += valor;
    }

    void transferir(float valor, Conta destino){
        sacar(valor);
        destino.depositar(valor);

    }
}
