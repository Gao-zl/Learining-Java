package calcu.sub2;

import calcu.sub1.Operator;

public class Calculator {
	/**
	 * ‘ÀÀ„
	 * 
	 * @param arg1
	 * @param arg2
	 * @param operator
	 * @return
	 */
	public double calc(double arg1, double arg2, String operator) {
		if (Operator.add.equals(operator)) {
			return arg1 + arg2;
		}
		if (Operator.sub.equals(operator)) {
			return arg1 - arg2;
		}
		if (Operator.pow.equals(operator)) {
			return arg1 * arg2;
		}
		if (Operator.div.equals(operator)) {
			return arg1 / arg2;
		}
		return arg2;

	}

}
