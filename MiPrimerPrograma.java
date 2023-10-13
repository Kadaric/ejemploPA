public class MiPrimerPrograma
{
	public static void main(String [] args)
	{
		Calculadora kadio = new Calculadora(3,5);
		System.out.println(kadio.sumar());
		System.out.println(kadio.sumar(10,2020));
		kadio.dividir();
		kadio.restar(5,3);
	}
}
