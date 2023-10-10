package Chap02_02encap.prev_code;

import java.util.function.BiFunction;

public enum CalculateType {

    //제어 자료와 실제로 제어되었을때 실행할 구문까지 함꼐 저장해놨음.
    // == 응집도가 높아졌음!(관련된 로직끼리 하나의 파일에 잘 구성되어있음)
    ADD((num1, num2) -> num1 + num2), // 자바 화살표 함수처럼 단순 변수나 자료만 실행문에 두면 리턴자료로 간주함

    MUNUS((num1, num2) -> num1 - num2),
    MULTIPLE((num1, num2) -> num1 * num2),
    DIVIDE((num1, num2) -> num1 / num2);

    //각 ENUM 자료형에 물려있는 함수의 형식에 대해서 멤버변수로 표현

    private BiFunction<Integer, Integer, Integer> expression;

    //CalculateType에 어떤 enum자료를 대입하냐에 따라 맞춰서 해당 로직을 호출할 수 있음

    CalculateType(BiFunction<Integer, Integer, Integer> expression){
        this.expression = expression;
    }

    public int calculate(int num1, int num2){
        //num1, num2를 받아 특정 enum에 매칭된 람다를 실행하기
        //Bifuntion자료형은 .apply()를 통해 해당 변수에 담긴 람다를 실행합니다.
        return this.expression.apply(num1, num2);
    }

}

