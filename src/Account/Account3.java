package Account;

public class Account3 {
	private String name; // vari�vel de inst�ncia
	private double balance; // vari�vel de inst�ncia
	
	// Construtor de Account que recebe dois par�metros
	public Account3(String name, double balance){
	this.name = name; // atribui name � vari�vel de inst�ncia name
	
	// valida que o balance � maior que 0.0; se n�o for,
	// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o de 0.0
	if (balance > 0.0) // se o saldo for v�lido 
	this.balance = balance; // o atribui � vari�vel de inst�ncia balance
	}
	
	// m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo �
	public void deposit(double depositAmount){ 
		
	if (depositAmount > 0.0) // se depositAmount for v�lido 
	balance = balance + depositAmount; // o adiciona ao saldo 
	}
	
	// m�todo retorna o saldo da conta 
	public double getBalance() 
	{ 
	return balance; 
	} 
	
	// m�todo que define o nome
	public void setName(String name)
	{
	this.name = name;
	}
	
	// m�todo que retorna o nome
	public String getName()
	{
	return name; // retorna o valor de name ao chamador
	} // fim do m�todo getName
} // fim da classe Account
