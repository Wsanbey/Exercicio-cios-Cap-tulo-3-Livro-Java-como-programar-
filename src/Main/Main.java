package Main;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Respostas rs = new Respostas();
		String Desenho = "*******************************************************\n";
		
//		QUEST�O 1
		System.out.println(Desenho+"Quest�o 1: Explique em linhas gerais o \nque voc� compreendeu "
				+ "sobre classes, construtores,\n"
				+  "m�todos e objetos.");
				rs.Questao1();
				System.out.println("\n");
		
		
//		QUEST�O 2
				System.out.println(Desenho +"Quest�o 2: Implemente a classe Account da figura 3.1. Explique o c�digo brevemente" );
				rs.Questao2();
				System.out.println("\n");
				
//		QUEST�O 3
				System.out.println(Desenho +"Quest�o 3: Que modificadores de acesso h� neste c�digo? Qual o efeito deles?." );
				rs.Questao3();
				System.out.println("\n");
				
//		QUEST�O 4
				System.out.println(Desenho +"Quest�o 4: Implemente, compile e rode o c�digo de AccountTest na figura 3.2. Explique\\r\\n\"\r\n"
						+ " + \"brevemente o papel desta classe em rela��o � classe Account." );
				rs.Questao4();
				System.out.println("\n");
				
//		QUEST�O 5
				System.out.println(Desenho +"Quest�o 5: Qual a vantagem de termos m�todos get e set em uma classe? \\n\"\r\n"
						+ " + \"Se preciso veja a\\r\\n\"\r\n"
						+ "	+ \"se��o 3.2.6. (p�g. 63)\"" );
				rs.Questao5();
				System.out.println("\n");

//		QUEST�O 6
				System.out.println(Desenho +"Quest�o 6: Explique um teste �til que podemos fazer com o valor null. \\nDica: veja se��o 3.2.2 e\\r\\n\"\r\n"
						+ " + \"3.3." );
				rs.Questao6();
				System.out.println("\n");

//		QUEST�O 7
				System.out.println(Desenho +"Quest�o 7: Modifique a classe Account de acordo com a figura 3.5. No construtor (ou no doc),\\r\\n\"\r\n"
						+ " + \"responda: como o Java sabe a diferen�a entre um construtor e um m�todo?\\r\\n\"\r\n"
						+ " + \"Explique os dois crit�rios: nome e retorno." );
				rs.Questao7();
				System.out.println("\n");

////		QUEST�O 8
				System.out.println(Desenho +"Quest�o 8: Explique o que ocorre com o c�digo de AccountTest depois que voc� implementou a\\r\\n\"\r\n"
						+ " + \"�ltima quest�o.\\r\\n\"\r\n"
						+ " + \"a. Ainda compila? Ainda roda?\\r\\n\"\r\n"
						+ " + \"b. Porque? Veja a se��o 3.4.2, p�g. 66 (construtores padr�o)." );
				rs.Questao8();
				System.out.println("\n");
				
//		QUEST�O 9
				System.out.println(Desenho +"Quest�o 9: Modifique AccountTest de acordo com a figura 3.6. Execute e explique o que\r\n"
						+ "acontece (acho que 1 linha explica)." );
				rs.Questao9();
				System.out.println("\n");

////		QUEST�O 10
				System.out.println(Desenho +"Quest�o 10: Modifique Account de acordo com a figura 3.8. (p�g.67), mas agora sem remover o\r\n"
						+ "construtor \"Account(String name)\". Execute AccountTest: compila? executa?" );
				rs.Questao10();
				System.out.println("\n");
//		QUEST�O 11
				System.out.println(Desenho +"Quest�o 11: Explique como as linhas 17 e 24 da figura 3.8 ajudam a classe a manter a\r\n"
						+ "integridade dos valores internos de Account." );
				rs.Questao11();
				System.out.println("\n");
//		QUEST�O 12
				System.out.println(Desenho +"Quest�o 12: Modifique AccountTest de acordo com a fig. 3.9 (p�g.68) e execute. O que ocorre\r\n"
						+ "com os valores de saldo das duas contas? Relacione este resultado com sua\r\n"
						+ "explica��o da quest�o anterior (11)." );
				rs.Questao12();
				System.out.println("\n");
//
//		QUEST�O 13
				System.out.println(Desenho +"Quest�o 13: Leia a se��o sobre c�digo duplicado na p�gina 70 e veja as linhas que esta se��o\r\n"
						+ "indica. Explique porque � ruim ter c�digo duplicado e como voc� poderia melhorar a\r\n"
						+ "capacidade de seu c�digo ser mantido, no futuro." );
				rs.Questao13();
				System.out.println("\n");

//		QUEST�O 14
				System.out.println(Desenho +"Quest�o 14: Crie e execute o c�digo da classe Dialog1, figura 3.12 (p�g. 71), colocando um texto\r\n"
						+ "seu em portugu�s.\r\n"
						+ "" );
				rs.Questao14();
				
				System.out.println("\n");

 
				System.out.println(Desenho +"Quest�o 15: Crie e execute o c�digo da classe NameDialog, figura 3.13. p�g.72. Explique o que\r\n"
						+ "ele faz" );
				System.out.println("O sistema cria uma janela e exibe o texto na tela");
				rs.Questao15();
				System.out.println("\n");
				
////		QUEST�O 16
//				System.out.println(Desenho +"Quest�o 16: Implemente a quest�o 3.15, p�g. 77, que pede para remover c�digo duplicado no\r\n"
//						+ "m�todo main. Lembre-se de sempre deixar as linhas a serem removidas como\r\n"
//						+ "coment�rios, para que eu saiba que voc� realmente realizou o que foi pedido.\r\n"
//						+ "public static void displayAccount(Account accountToDisplay)" );
//
				rs.Questao16();
				
				System.out.println("\n");
				
				
////		QUEST�O 17
//				System.out.println(Desenho +"Quest�o 17: Inspirado no seu c�digo da quest�o 15, da classe NameDialog, crie o m�todo a\r\n"
//						+ "seguir. O que ele faz � muito parecido com displayAccount. Por�m, voc� dever�\r\n"
//						+ "gerar um texto (String) e us�-lo para exibir o valor da conta, usando uma janela\r\n"
//						+ "gr�fica.\r\n"
//						+ "public static void displayAccountGrafico(Account accountToDisplay)\r\n"
//						+ "Use o seguinte c�digo para gerar textos.\r\n"
//						+ "String texto = String.format(\"O valor � [%d]\", 42);" );
//
				rs.Questao17();
				System.out.println("\n");

	}

}
