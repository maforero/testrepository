package com.test;

public class FirstChain extends AbstractChain {

	@Override
	public StringBuilder process(StringBuilder builder) {

		builder.append("first builder ");
		
		return super.processValidate(builder);
	}


}
