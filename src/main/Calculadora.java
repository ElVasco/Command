package main;

public class Calculadora {

	int valorActual = 0;
	
	public void operacion(char operador, int operando) {
		
		//while(operador != 'º') {
		switch (operador) {
		case '+':
			valorActual += operando;
			break;
		case '-':
			valorActual -= operando;
			break;
		case '*':
			valorActual *= operando;
			break;
		case '/':
			valorActual /= operando;
			break;
		default:
			System.out.println("operacion no soportada!!!");
			break;
		}
		System.out.println("valor actual: " + valorActual);
		//}
	}
}
