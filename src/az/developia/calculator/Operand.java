package az.developia.calculator;

public enum Operand {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    REMAINDER("%"),
    SQRT("|/-")
    ;

    private String value;

    Operand(String value) {
        this.value = value;
    }

    public static Operand find(String value){
        for (Operand o : values()){
            if (o.value.equals(value)){
                return o;
            }
        }
        return null;
    }
}
