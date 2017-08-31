package com.eplugger;
/**
 * helloWorldÀà
 * @author Administrator
 *
 */
public class HelloWorld {
	private String message;
	Test test;
	/*public HelloWorld(Test test){
		this.test = test;
	}*/
	public void setTest(Test test){
		this.test = test;
	}
	public void print(){
		test.printMessage();
	}
	
	public void setMessage(String message){
		this.message = message;
	}

	public void getMessage(){
		System.out.println("Your Message:"+message+"!");
	}
}
