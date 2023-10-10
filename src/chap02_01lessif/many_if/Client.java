package chap02_01lessif.many_if;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        //1. CalculateType이 null이라면 연산이 되지 않아야함. -> null 검사를 매 로직마다 해줘여함
        //2. DIVIDE 시에 num2가 0이라면? -> 0인지 검사해서 0이면 예외를 발생시키고 아니면 처리해야함
        //위 2개 이슈를 해결할 수 있는 방식으로 if문을 고쳐야함
        if (calculateType != null && calculateType.equals(calculateType.ADD)) {
            result = num1 + num2;
        } else if (calculateType != null && calculateType.equals(calculateType.MINUS)) {
            result = num1 - num2;
        } else if (calculateType != null && calculateType.equals(calculateType.MULTIPLE)) {
            result = num1 * num2;
        } else if (calculateType != null && calculateType.equals(calculateType.DIVIDE)) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                throw new RuntimeException("0으로 나눌 수 없습니다.");
            }
        }
        return result;
    }
}