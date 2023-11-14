package calculator;

public class Number extends Operator{

    private final int value;

    public Number(int value){
        this.value = value;
    }

    public int value(){
        return value;
    }

    @Override
    public void execute(){
        JCalculator.instance().push(value);
    }

    @Override
    public String toString(){
        return Integer.toString(value);
    }
}
