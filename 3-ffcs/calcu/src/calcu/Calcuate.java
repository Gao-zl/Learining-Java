package calcu;

import calcu.sub1.Operator;
import calcu.sub2.Calculator;

public class Calcuate {

	public static void main(String[] args) {
		double arg1, arg2, result;
		arg1 = 1;
		arg2 = 2;

		Calculator calculator = new Calculator();
		// �ӷ�
		result = calculator.calc(arg1, arg2, Operator.add);
		System.out.println("add " + result);
		// ����
		result = calculator.calc(arg1, arg2, Operator.sub);
		System.out.println("sub " + result);
		// �˷�
		result = calculator.calc(arg1, arg2, Operator.pow);
		System.out.println("pow " + result);
		// ����
		result = calculator.calc(arg1, arg2, Operator.div);
		System.out.println("div " + result);
	}

}
