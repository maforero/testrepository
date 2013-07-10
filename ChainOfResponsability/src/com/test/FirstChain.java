package com.test;

public class FirstChain extends AbstractChain {

	@Override
	public StringBuilder process(StringBuilder builder) {

		builder.append("fist builder ");
		
		return super.processValidate(builder);
	}


}
