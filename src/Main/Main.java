package Main;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Respostas rs = new Respostas();
		String Desenho = "*******************************************************\n";
		
//		QUESTÃO 1
		System.out.println(Desenho+"Questão 1: Explique em linhas gerais o \nque você compreendeu "
				+ "sobre classes, construtores,\n"
				+  "métodos e objetos.");
				rs.Questao1();
				System.out.println("\n");
		
		
//		QUESTÃO 2
				System.out.println(Desenho +"Questão 2: Implemente a classe Account da figura 3.1. Explique o código brevemente" );
				rs.Questao2();
				System.out.println("\n");
				
//		QUESTÃO 3
				System.out.println(Desenho +"Questão 3: Que modificadores de acesso há neste código? Qual o efeito deles?." );
				rs.Questao3();
				System.out.println("\n");
				
//		QUESTÃO 4
				System.out.println(Desenho +"Questão 4: Implemente, compile e rode o código de AccountTest na figura 3.2. Explique\\r\\n\"\r\n"
						+ " + \"brevemente o papel desta classe em relação à classe Account." );
				rs.Questao4();
				System.out.println("\n");
				
//		QUESTÃO 5
				System.out.println(Desenho +"Questão 5: Qual a vantagem de termos métodos get e set em uma classe? \\n\"\r\n"
						+ " + \"Se preciso veja a\\r\\n\"\r\n"
						+ "	+ \"seção 3.2.6. (pág. 63)\"" );
				rs.Questao5();
				System.out.println("\n");

//		QUESTÃO 6
				System.out.println(Desenho +"Questão 6: Explique um teste útil que podemos fazer com o valor null. \\nDica: veja seção 3.2.2 e\\r\\n\"\r\n"
						+ " + \"3.3." );
				rs.Questao6();
				System.out.println("\n");

//		QUESTÃO 7
				System.out.println(Desenho +"Questão 7: Modifique a classe Account de acordo com a figura 3.5. No construtor (ou no doc),\\r\\n\"\r\n"
						+ " + \"responda: como o Java sabe a diferença entre um construtor e um método?\\r\\n\"\r\n"
						+ " + \"Explique os dois critérios: nome e retorno." );
				rs.Questao7();
				System.out.println("\n");

////		QUESTÃO 8
				System.out.println(Desenho +"Questão 8: Explique o que ocorre com o código de AccountTest depois que você implementou a\\r\\n\"\r\n"
						+ " + \"última questão.\\r\\n\"\r\n"
						+ " + \"a. Ainda compila? Ainda roda?\\r\\n\"\r\n"
						+ " + \"b. Porque? Veja a seção 3.4.2, pág. 66 (construtores padrão)." );
				rs.Questao8();
				System.out.println("\n");
				
//		QUESTÃO 9
				System.out.println(Desenho +"Questão 9: Modifique AccountTest de acordo com a figura 3.6. Execute e explique o que\r\n"
						+ "acontece (acho que 1 linha explica)." );
				rs.Questao9();
				System.out.println("\n");

////		QUESTÃO 10
				System.out.println(Desenho +"Questão 10: Modifique Account de acordo com a figura 3.8. (pág.67), mas agora sem remover o\r\n"
						+ "construtor \"Account(String name)\". Execute AccountTest: compila? executa?" );
				rs.Questao10();
				System.out.println("\n");
//		QUESTÃO 11
				System.out.println(Desenho +"Questão 11: Explique como as linhas 17 e 24 da figura 3.8 ajudam a classe a manter a\r\n"
						+ "integridade dos valores internos de Account." );
				rs.Questao11();
				System.out.println("\n");
//		QUESTÃO 12
				System.out.println(Desenho +"Questão 12: Modifique AccountTest de acordo com a fig. 3.9 (pág.68) e execute. O que ocorre\r\n"
						+ "com os valores de saldo das duas contas? Relacione este resultado com sua\r\n"
						+ "explicação da questão anterior (11)." );
				rs.Questao12();
				System.out.println("\n");
//
//		QUESTÃO 13
				System.out.println(Desenho +"Questão 13: Leia a seção sobre código duplicado na página 70 e veja as linhas que esta seção\r\n"
						+ "indica. Explique porque é ruim ter código duplicado e como você poderia melhorar a\r\n"
						+ "capacidade de seu código ser mantido, no futuro." );
				rs.Questao13();
				System.out.println("\n");

//		QUESTÃO 14
				System.out.println(Desenho +"Questão 14: Crie e execute o código da classe Dialog1, figura 3.12 (pág. 71), colocando um texto\r\n"
						+ "seu em português.\r\n"
						+ "" );
				rs.Questao14();
				
				System.out.println("\n");

 
				System.out.println(Desenho +"Questão 15: Crie e execute o código da classe NameDialog, figura 3.13. pág.72. Explique o que\r\n"
						+ "ele faz" );
				System.out.println("O sistema cria uma janela e exibe o texto na tela");
				rs.Questao15();
				System.out.println("\n");
				
////		QUESTÃO 16
//				System.out.println(Desenho +"Questão 16: Implemente a questão 3.15, pág. 77, que pede para remover código duplicado no\r\n"
//						+ "método main. Lembre-se de sempre deixar as linhas a serem removidas como\r\n"
//						+ "comentários, para que eu saiba que você realmente realizou o que foi pedido.\r\n"
//						+ "public static void displayAccount(Account accountToDisplay)" );
//
				rs.Questao16();
				
				System.out.println("\n");
				
				
////		QUESTÃO 17
//				System.out.println(Desenho +"Questão 17: Inspirado no seu código da questão 15, da classe NameDialog, crie o método a\r\n"
//						+ "seguir. O que ele faz é muito parecido com displayAccount. Porém, você deverá\r\n"
//						+ "gerar um texto (String) e usá-lo para exibir o valor da conta, usando uma janela\r\n"
//						+ "gráfica.\r\n"
//						+ "public static void displayAccountGrafico(Account accountToDisplay)\r\n"
//						+ "Use o seguinte código para gerar textos.\r\n"
//						+ "String texto = String.format(\"O valor é [%d]\", 42);" );
//
				rs.Questao17();
				System.out.println("\n");

	}

}
