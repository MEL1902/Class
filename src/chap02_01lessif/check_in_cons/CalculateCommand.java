package chap02_01lessif.check_in_cons;



public class CalculateCommand {

    private CalculateType calculateType;

    private int num1;//이 필드에는 정수이기만 하면 숫자가 몇이건 범위 내에서 다 대입 가능
    private int num2;

    public CalculateCommand(CalculateType calculateType, int num1, int num2){
        //생성단계에서 검증에 실패했다면, unchecked exception을 사용하는것이 더 좋음.
        if(calculateType == null)
            throw new RuntimeException("CalculateType은 필수 값 입니다.");
        if(calculateType == CalculateType.DIVIDE && num2 == 0)
            throw new RuntimeException("0으로 나눌 수 없습니다.");

        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public chap02_01lessif.check_in_cons.CalculateType getCalculateType() {
        return calculateType;
    }

}
