package com.test;

public class Main {

	public static void main(String[] args) {
		FirstChain firstChain = new FirstChain();
		SecondChain secondChain = new SecondChain();
		
		firstChain.setNextChain(secondChain);
		
		System.out.println(firstChain.process(new StringBuilder()));
	}
}
