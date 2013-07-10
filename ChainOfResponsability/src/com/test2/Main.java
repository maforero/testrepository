package com.test2;

public class Main {

	public static void main(String[] args) {
		
		ChainHandler chainHandler = ChainHandler.getInstance();
		chainHandler.addChain(new FirstStringChain());
		chainHandler.addChain(new SecondStringChain());
		
		System.out.println(chainHandler.process(new StringBuilder("jejej ")));
	}
}
