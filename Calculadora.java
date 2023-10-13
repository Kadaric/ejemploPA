public class Calculadora
{
	int val1;
	int val2;
	
	Calculadora()
	{
		val1=0;
		val2=0;
	}
	
	Calculadora(int val1, int val2)
	{
		this.val1 = val1;
		this.val2 = val2;
	}

	public int sumar()
	{
		return 10;
	}
	
	public int sumar(int a, int b)
	{
		return a+b;
	}

	public void dividir()
	{
		System.out.println("Ya dividi");
	}
	
	public void restar(int a, int b)
	{
		int resultado = a-b;
		System.out.println(resultado);
	}
	
}