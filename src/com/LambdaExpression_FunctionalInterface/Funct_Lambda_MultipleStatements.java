package com.LambdaExpression_FunctionalInterface;
@FunctionalInterface
public interface Funct_Lambda_MultipleStatements {
	String say(String message);  
}
class LambdaExpression{
	public static void main(String[] args) {
		Funct_Lambda_MultipleStatements flm = message->{
			String str1 ="Hi,";
			String str2=str1+message;
			return str2;
			
		};
		System.out.println(flm.say(" This is Navya"));
	}
}