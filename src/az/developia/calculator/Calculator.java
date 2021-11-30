package az.developia.calculator;

import java.util.Scanner;

public class Calculator {
    private int a;
    private String operand;
    private int b;

    private void getInputs() {
        var sc = new Scanner(System.in);
        System.out.println("First num: ");
        this.a = sc.nextInt();
        System.out.println("az.developia.calculator.Operand (+, -, /, *, %) :");
        this.operand = sc.next();
        System.out.println("Second num: ");
        this.b = sc.nextInt();
    }

    public int execute() {
        getInputs();

        int result;
        var operandType = Operand.find(this.operand);
        if (operandType == null){
            throw new RuntimeException("Wrong operand");
        }
        switch (operandType) {
            case PLUS:
                result = add();
                break;
            case MINUS:
                result = subtract();
                break;
            case MULTIPLY:
                result = muliply();
                break;
            case DIVIDE:
                result = divide();
                break;
            case REMAINDER:
                result = remainder();
                break;
            default:
                throw new RuntimeException("Not implemented");
        }
        return result;
    }

    public int add() {
        return this.a + this.b;
    }

    public int subtract(){
        return this.a - this.b;
    }

    public int muliply(){
        return this.a * this.b;
    }
    public int divide(){
        if (this.b ==0){
            throw new RuntimeException("This operation is wrong");
        }
        return this.a / this.b;
    }

    public int remainder(){
        if (this.b ==0){
            throw new RuntimeException("This operation is wrong");
        }
        return this.a % this.b;
    }
}
