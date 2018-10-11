
public class Conta_Corrente extends Conta {
	@Override
     void depositar(double Valor_Depositar) {
		this.saldo += Valor_Depositar;
		this.saldo = this.saldo - 0.03*this.saldo;
    }
	@Override
	void sacar(double Valor_Sacar) {
		double novoSaldo = this.saldo - Valor_Sacar ; 
        this.saldo = novoSaldo;
        this.saldo = this.saldo - 0.03*this.saldo;
	}
	

}
