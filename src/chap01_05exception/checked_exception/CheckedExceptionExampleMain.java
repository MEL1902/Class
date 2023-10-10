package chap01_05exception.checked_exception;

public class CheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        //해당 메서드가 throws로 본인을 호출하는 지역에서 예외처리를 하라고 떠넘긴 상태이므로
        //현재 호출하고 있는 main method에서 try~catch를 작성해야함
        try {
            client.throwsCheckedExceptionMethod();
        } catch (CheckedException e){
            //예외처리 완료
            e.printStackTrace();
        }

        //이미 try~catch처리가 된 메서드의 경우는 호출지역에서 따로 처리하지 않아도 됨
        client.tryCatchCheckedExceptionMethod();
    }
}