package calculator.element.operaor;

import calculator.element.operand.Operand;

public class Minus implements Operator {
    public Operand operate(Operand operandA, Operand operandB) {
        return new Operand(operandA.getValue() - operandB.getValue());
    }
}