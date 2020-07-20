package calcu;

import calcu.sub1.Operator;
import calcu.sub2.Calculator;

public class Calcuate {

	public static void main(String[] args) {
		double arg1, arg2, result;
		arg1 = 1;
		arg2 = 2;

		Calculator calculator = new Calculator();
		// 加法
		result = calculator.calc(arg1, arg2, Operator.add);
		System.out.println("add " + result);
		// 减法
		result = calculator.calc(arg1, arg2, Operator.sub);
		System.out.println("sub " + result);
		// 乘法
		result = calculator.calc(arg1, arg2, Operator.pow);
		System.out.println("pow " + result);
		// 除法
		result = calculator.calc(arg1, arg2, Operator.div);
		System.out.println("div " + result);
	}

}
