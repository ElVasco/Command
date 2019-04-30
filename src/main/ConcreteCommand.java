package main;

public class ConcreteCommand extends Command{

	private char operador;
	private int operando;
	private Calculadora calculadora;
	
	public ConcreteCommand(char operador, int operando, Calculadora calculadora) {
		super();
		this.operador = operador;
		this.operando = operando;
		this.calculadora = calculadora;
	}

	@Override
	public void ejecutar() {
		calculadora.operacion(operador, operando);
	}

	@Override
	public void deshacer() {
		calculadora.operacion(operadorInverso(), operando);
	}
	
	private char operadorInverso() {
		switch (operador) {
		case '+':
			return '-';
		case '-':
			return '+';
		case '*':
			return '/';
		case '/':
			return '*';
		default:
			System.out.println("operacion no soportada!!!");
			return 0;
		}
	}

}
