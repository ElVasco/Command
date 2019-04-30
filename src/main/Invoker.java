package main;

import java.util.ArrayList;
import java.util.List;

//desde esta clase gestionamos todos los comandos
public class Invoker {

	private Calculadora calculadora = new Calculadora();
	private List<Command> commands = new ArrayList<Command>();
	private int comandoActual = 0;
	
	public void compute(char operador, int operando) {
		Command nuevo = new ConcreteCommand(operador, operando, calculadora);
		nuevo.ejecutar();
		commands.add(nuevo);
		comandoActual++;
	}
	
	public void deshacer() {
		if(comandoActual>0) {
			int comandoAnterior = comandoActual - 1;
			Command comandoADeshacer = commands.get(comandoAnterior);
			comandoADeshacer.deshacer();
			comandoActual = comandoAnterior;
		}
	}
}
