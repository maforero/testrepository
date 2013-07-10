package com.test;

public class SecondChain extends AbstractChain {

	@Override
	public StringBuilder process(StringBuilder builder) {

		builder.append("Second builder ");
		
		return processValidate(builder);
	}


}
