package simplecalculator;

public class Calculator {

  public double firstOp;
  public double secondOp;
  public double result;
  public char operator;

  public Calculator() {
    // Initialize operands and operator to default values
    this.firstOp = 0;
    this.secondOp = 0;
    this.result = 0;
    this.operator = '+';
  }

  public void setNum1(double num1) {
    this.firstOp = num1;
  }

  public void setNum2(double num2) {
    this.secondOp = num2;
  }

  public void setOperator(char operator) {
    this.operator = operator;
  }

  public double calculate() {
    switch (operator) {
      case '+':
        return firstOp + secondOp;
      case '-':
        return firstOp - secondOp;
      case '*':
        return firstOp * secondOp;
      case '/':
        if (secondOp == 0) {
          throw new ArithmeticException("Division by zero");
        }
        return firstOp / secondOp;
      default:
        throw new IllegalArgumentException("Invalid operator");
    }
  }
  
  
}