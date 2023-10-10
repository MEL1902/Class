package Chap02_02encap.setter_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand){
        //클라이언트는 연산 결과를 달라고만 주문하면 됨.
        //결합도가 낮아짐 -> 외부 클래스에 대한 호출 구문 라인수가 줄어듦

        int result = calculateCommand.getCalculateResult();

        return result;
    }
}
