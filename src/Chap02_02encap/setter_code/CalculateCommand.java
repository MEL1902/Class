package Chap02_02encap.setter_code;



public class CalculateCommand {

    private CalculateType calculateType;
    private int num1;
    private int num2;

    //setter로 추후 주입할 수 있도록 setter만 두기

    public void setCalculateType(CalculateType calculateType) {this.calculateType = calculateType;}
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //    public CalculateCommand(CalculateType calculateType, int num1, int num2){
//        this.calculateType = calculateType;
//        this.num1 = num1;
//        this.num2 = num2;
//    }

//    public int getNum1() {return num1;}
//
//    public int getNum2() {return num2;}

//    public CalculateType getCalculateType() {return calculateType;}
public int getCalculateResult(){
    //지역변수에 필드를 대입
    CalculateType calculateType = this.calculateType;
    int num1 = this.num1;
    int num2 = this.num2;

    //생성자에서 이미 유효성 검사가 완료되었고, setter가 없으므로 값이 변하지 않는다는것까지 보장되므로 바로 연산
    int result = calculateType.calculate(num1, num2);

    return result;
}


    //getter setter 만들어야함 generate 로
}

