import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) throws IOException {
		
		  Scanner entrada = new Scanner(System.in);	
		  Conta_Corrente transicao_Corrente = new Conta_Corrente();
		  Conta_Poupanca transicao_Poupanca = new Conta_Poupanca();
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Halyson Itallo\\eclipse-workspace\\Banco\\Transição"));
		  Gravar t = new Gravar();
		  
			while(true) {
				    System.out.println("BEM VINDO AO BANCO HALYSON.\nSe deseja usar a conta corrente digite[1]\nSe deseja usar a conta poupança digite[2]");
				    int escolha_conta = entrada.nextInt();
				    if (escolha_conta == 1) {
		        	System.out.println("******************************\nSe quiser depositar na conta digite [1]\nSe quiser sacar da conta digite [2]");
		        	int Decisao_conta = entrada.nextInt();
		             switch (Decisao_conta) 
		                 {
		        			case 1:
		        				BufferedWriter AOPSai = t.CriaArq("Transição_Corrente");
		        				System.out.println("Quanto voçê quer depositar?");
		        				transicao_Corrente.depositar(entrada.nextDouble());
		        			    AOPSai.write(String.valueOf(transicao_Corrente.saldo));       
		        			    AOPSai.close();   
		        			break;		
		        			case 2:
		        				System.out.println("Quanto voçê quer sacar?");
		        				double sacar = entrada.nextDouble();
		        				if(sacar <= transicao_Corrente.saldo)
		        				{   
		        					transicao_Corrente.sacar(sacar);
		        					System.out.println(transicao_Corrente.saldo);
		        					BufferedWriter AOPSa = t.CriaArq("Transição_Corrente");
		        					AOPSa.write(String.valueOf(transicao_Corrente.saldo));
		        					AOPSa.close();
		        				}
		        				else 
		        				{
		        					System.out.println("Dinheiro insuficiente");
		        				}
		        			break;
		        	     }
				    }
				  else if(escolha_conta == 2 ) 
				   {
					   System.out.println("******************************\nSe quiser depositar na conta digite [1]\nSe quiser sacar da conta digite [2]");
			        	int Decisao_conta = entrada.nextInt();
			             switch (Decisao_conta) 
			                 {
			        			case 1:
			        				BufferedWriter AOPSai = t.CriaArq("Transição_Poupanca");
			        				System.out.println("Quanto voçê quer depositar?");
			        				transicao_Poupanca.depositar(entrada.nextDouble());
			        			    AOPSai.write(String.valueOf(transicao_Poupanca.saldo));       
			        			    AOPSai.close();   
			        			break;		
			        			case 2:
			        				System.out.println("Quanto voçê quer sacar?");
			        				double sacar = entrada.nextDouble();
			        				if(sacar <= transicao_Poupanca.saldo)
			        				{   
			        					transicao_Poupanca.sacar(sacar);
			        					System.out.println(transicao_Poupanca.saldo);
			        					BufferedWriter AOPSa = t.CriaArq("Transição_Poupanca");
			        					AOPSa.write(String.valueOf(transicao_Poupanca.saldo));
			        					AOPSa.close();
			        				}
			        				else 
			        				{
			        					System.out.println("Dinheiro insuficiente");
			        				}
			        			break;
			        	     }   
				   } 
				        else
				        {
				        	System.out.println("Verifique se você digitou corretamente");
				        }
		        			System.out.println("Deseja continuar?");
		        			String continuar = entrada.next();
		        			 if(continuar.equals("Sim"))
		        			   {
		        				System.out.println("**********************\n\n\n");   
		        			   }
		        			   else if(continuar.equals("Não"))
		        			   {
		        				return; 
		        			   }  
		        			   else
		        			   {
		        				System.out.println("Digitado incorretamente");
		                       }		 
		  }	   
	 }
}

