package com.test;

public abstract class AbstractChain {

	private AbstractChain nextChain;

	public AbstractChain() {
		super();
	}

	public AbstractChain(AbstractChain nextChain) {
		super();
		this.nextChain = nextChain;
	}

	public StringBuilder processValidate(StringBuilder builder) {
		
		if (nextChain == null) {
			return builder;
		}
		
		return nextChain.process(builder);
	}
	
	public abstract StringBuilder process(StringBuilder builder); 

	public AbstractChain getNextChain() {
		return nextChain;
	}

	public void setNextChain(AbstractChain nextChain) {
		this.nextChain = nextChain;
	}

}
