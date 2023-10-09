package chap01_01oopdesc.without_interface;

public class Client {

    public void someMethod(){
        //메세지 보내기 전에 사전에 서버 연결 등...
        //코드들

        //사전작업 후 메세지 발송 코드
        RealMessageSender messageSender = new RealMessageSender();
        messageSender.send();
    }
}
