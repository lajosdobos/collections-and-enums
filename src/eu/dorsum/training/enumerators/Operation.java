package eu.dorsum.training.enumerators;

import java.util.function.DoubleBinaryOperator;

public enum Operation implements DoubleBinaryOperator {
    PLUS    ("+", (l, r) -> l + r),
    MINUS   ("-", (l, r) -> l - r),
    MULTIPLY("*", (l, r) -> l * r),
    DIVIDE  ("/", (l, r) -> l / r);

    private final String symbol;
    private final DoubleBinaryOperator binaryOperator;

    private Operation(final String symbol, final DoubleBinaryOperator binaryOperator) {
        this.symbol = symbol;
        this.binaryOperator = binaryOperator;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public double applyAsDouble(final double left, final double right) {
        return binaryOperator.applyAsDouble(left, right);
    }
}