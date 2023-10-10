package chap01_05exception.unchecked_exception;

public class UncheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        //throws로 던져진 예외이지만 try~catch를 강요받지는 않음
        //try~catch를 사용하는것도 역시 가능함

        client.throwsUncheckedExceptionMethod();

        //throws가 아닌 특정 메서드 내부에서 예외를 발생시키는데 예외처리를 해주지 않아도 무방함
        client.tryCatchUncheckedExceptionMethod();
    }
}
