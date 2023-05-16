package Interfaces;

interface FirstInterface {
	public void myMethod();

}

interface SecondInterface {
	public void myOtherMethod();

}

class DemoMain implements FirstInterface, SecondInterface {

	public void myMethod() {

		System.out.println("Enter some  text");
	}

	public void myOtherMethod() {

		System.out.println("Enter some other text");

	}

}

public class Main {
	public static void main(String[] args) {

		DemoMain obj = new DemoMain();

		obj.myMethod();
		obj.myOtherMethod();

	}
}
