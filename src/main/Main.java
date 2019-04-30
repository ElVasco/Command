package main;

public class Main {

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		invoker.compute('+', 5);
		invoker.compute('-', 3);
		invoker.compute('*', 8);
		invoker.compute('/', 2);
		
		invoker.deshacer();
		
	}
	

}
