package Main;
import Account.Account;
import Account.Account2;
import Account.Account3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Respostas {
	
//	FEITO
	public void Questao1() {
	System.out.println("Classes: Uma classe comumente define o estado e o comportamento de um \n"
			+ "objeto implementando atributos e métodos. \n");
	System.out.println("Construtores: são basicamente funções de inicialização de uma classe, \n"
			+ "as quais são invocadas no momento em que "
			+ "objetos desta classe são criadas\n");
	System.out.println("Método:é uma palavra que provém do termo grego methodos "
			+ "\n(“caminho” ou “via”) e que se refere ao meio utilizado para chegar a um fim.");
	System.out.println("Objetos: objetos confere aos sistemas maior clareza, "
			+ "\ndistribuição mais adequada de responsabilidades, encapsulamento de atributos e \n"
			+ "comportamentos, dentre muitas outras características");
	}
//	FEITO
	public void Questao2() {
		String nome; // variável de instância
		
		//  definir o nome no objeto
		 nome = "Welry";
		 
		// retorna valor do nome para o chamado
		 System.out.println("Saida: "+nome);
		 
		 System.out.println("O código utiliza os metodos get e set para manipular o valor"
		 		+ "da variavel privada name");
	}
//	FEITO
	public void Questao3() {
		System.out.println("Métodos SET fazem com que você modifique o valor de um atributo \n"
				+ "do objeto de forma indireta\n"
				+ "O método GET faz com que você leia o valor \nde um atributo de forma indireta também.");
	}
//	FEITO
	public void Questao4() {
		// cria um objeto Account e o atribui a myAccountÿ
		 Account myAccount = new Account();  

		 // exibe o valor inicial do nome (null)
		 System.out.printf("Initial name is: %s%n%n",  myAccount.getName());

//				 solicita e lê o nome
		 System.out.println("Please enter the name:");
		 //String theName = entrada.nextLine(); // lê uma linha de texto 
		 String theName = "Welry";
		 myAccount.setName(theName); // insere theName em myAccount  
		 System.out.println(); // gera saída de uma linha em branco
		 
		 // exibe o nome armazenado no objeto myAccount
		 System.out.printf("Name in object myAccount is:%n%s%n",
		 myAccount.getName() );
		 
		 System.out.println("O programa imprime null e depois o valor a\n"
		 		+ "o valor atribuido a variavel atravez do set");
	}
//	FEITO
	public void Questao5() {
		System.out.println(" A vantagem se dá no momento que tenha alguma lógica no acessador \n"
				+ "ou modificador, portanto algum algoritmo executando seja no getter, \n"
				+ "seja no setter.");
	}
//	FEITO
	public void Questao6() {
	System.out.println("Em algumas situações podemos querer saber se o valor de uma \n"
			+ "variável é NULL, ou seja, nenhum valor foi atribuído à ela");
	}
//	FEITO
	public void Questao7() {
		// cria um objeto Account e o atribui a myAccount e apresenta um erro
		 Account2 myAccount = new Account2("welry");  
	
		 // exibe o valor inicial do nome (null)
		 System.out.printf("apresenta um erro pedindo que seja inserido uma variavel mais\n"
		 		+ "ainda nao foi criada\nInitial name is: %s%n%n",  myAccount.getName() );
	
		 // solicita e lê o nome
		 System.out.println("Please enter the name:");
		 //String theName = entrada.nextLine(); // lê uma linha de texto 
		 String theName = "Welry";
		 myAccount.setName(theName); // insere theName em myAccount  
		 System.out.println(); // gera saída de uma linha em branco
		 
		 // exibe o nome armazenado no objeto myAccount
		 System.out.printf("Name in object myAccount is:%n%s%n",
		 myAccount.getName() );
		 
		 System.out.println("O programa imprime null e depois o valor a\n"
		 		+ "o valor atribuido a variavel atravez do set");
	
		 
		System.out.println("A principal diferença entre construtores e métodos \n"
				+ "é que Construtores criam e inicializam objetos que ainda não existem,\n"
				+ "enquanto Métodos realizam operações em objetos que já existem."
				+ "");
		
	}
//	FEITO
	public void Questao8() {
		System.out.printf("O programa AccountTest (Figura 3.6) \n"
				+ "inicializa dois objetos Account usando o construtor\n");
	}
//	FEITO
	public void Questao9() {
		Account2 account = new Account2("welry");  
		Account2 account1 = new Account2("Jane Green"); 
		Account2 account2 = new Account2("John Blue");
		
		// exibe o valor inicial de nome para cada Account
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());
	}
//	FEITO
	public void Questao10() {
		System.out.println("O programa apresenta erro e nao compila");
	}
//	FEITO
	public void Questao11() {
		System.out.println(" Validando e verificando os valores para cadae\n"
				+ "situação do codigo");
	}
//	FEITO
	public void Questao12() {
		Account3 account1 = new Account3("Jane Green", 50.00);
		Account3 account2 = new Account3("John Blue", -7.53);
		
		// exibe saldo inicial de cada objeto
		System.out.printf("%s balance: $%.2f %n",
		account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
		account2.getName(),account2.getBalance());
		
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = entrada.nextDouble(); // obtém a entrada do usuárioÿ
		System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1ÿ
		
		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n",
		account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
		account2.getName(),account2.getBalance()); 
		
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = entrada.nextDouble(); // obtém a entrada do usuárioÿ
		System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2ÿ
		
		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n",
		account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());
		entrada.close();
		} 

	public void Questao13() {}
//	FEITO
	public void Questao14() {
		// exibe um diálogo com uma mensagem
				JOptionPane.showMessageDialog(null, "BEM VINDO AO JAVA");
	}
//	FEITO
	public void Questao15() {
		// pede para o usuário inserir seu nome ÿ
		String name = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		// cria a mensagem
		String message =
		String.format("BEM VINDO, %s , Ao programe como programar!", name);
		
		// exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
	}
	public void Questao16() {
		
	}
	public void Questao17() {}
}
