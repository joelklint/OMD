package expr;

import java.util.Map;

public class Conjunction extends TwoVariableExpr {

	public Conjunction(Expr e1, Expr e2) {
		super(e1, e2);
	}

	public boolean value(Map<Variable, Boolean> map) {
		Boolean v1 = e1.value(map);
		Boolean v2 = e2.value(map);
		return v1 && v2;

	}

	@Override
	protected String getOperand() {
		return "^";
	}
}
