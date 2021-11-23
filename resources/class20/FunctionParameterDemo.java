package func;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class FunctionParameterDemo {

	public static class Add5 implements Function<Integer, Integer> {
		public Integer apply(Integer x) {
			return x + 5;
		}
	}

	public static class MultBy3IfPositive implements Function<Integer, Integer> {
		public Integer apply(Integer x) {
			if (x > 0) {
				return 3 * x;
			} else {
				return 0;
			}
		}
	}

	public static Integer applyToSeven(Function<Integer, Integer> f) {
		return f.apply(7);
	}

	public static Integer applyToMinusNine(Function<Integer, Integer> f) {
		return f.apply(-9);
	}

	public static void main(String[] args) {
		Add5 add5 = new Add5();
		MultBy3IfPositive multBy3IfPositive = new MultBy3IfPositive();
		int val1 = applyToSeven(add5); // val1 = 12
		int val2 = applyToSeven(multBy3IfPositive); // val2 = 21
	}
}
