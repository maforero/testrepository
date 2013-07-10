package com.test2;

import java.util.LinkedList;
import java.util.List;

public class ChainHandler {

	private List<AbstractStringChain> chains;
	
	private static ChainHandler chainHandler;
	
	private ChainHandler() {
		chains = new LinkedList<AbstractStringChain>();
	}
	
	public static ChainHandler getInstance() {
		if (chainHandler == null) {
			chainHandler = new ChainHandler();
		}
		
		return chainHandler;
	}
	
	public String process(StringBuilder builder) {
			
		for (AbstractStringChain chain : chains) {
			chain.process(builder);
		}
		
		return builder.toString();
	}
	
	public void addChain(AbstractStringChain chain) {
		chains.add(chain);
	}
}
