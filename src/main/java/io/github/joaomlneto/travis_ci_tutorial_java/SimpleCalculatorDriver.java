package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculatorDriver {
	public static final void main(String[] args) {
		System.out.println("Hello world?");
		int num = 2;
		SimpleCalculator calculator = new SimpleCalculator();
		num = calculator.mul(num, 3);
		num = calculator.mul(num, 7);
		num = calculator.mul(num, 13);
		num = calculator.mul(num, 37);
		System.out.println("Num = " + num);
	}
}
