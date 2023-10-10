package Chap02_02encap.prev_code;

public class CalculateCommand {

    private CalculateType calculateType;
    private int num1;
    private int num2;

    public CalculateCommand(CalculateType calculateType, int num1, int num2){
        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {return num1;}

    public int getNum2() {return num2;}

    public CalculateType getCalculateType() {return calculateType;}

    public void setCalculateType(CalculateType calculateType) {this.calculateType = calculateType;}


    //getter setter 만들어야함 generate 로
}

