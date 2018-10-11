
public class Conta {
	 double saldo;
	 void sacar(double Valor_Sacar)
	  {      
	         double novoSaldo = this.saldo - Valor_Sacar ; 
	         this.saldo = novoSaldo;
	  }
	 	void depositar(double Valor_Depositar) {
	         this.saldo += Valor_Depositar;
	     }
	     

}
