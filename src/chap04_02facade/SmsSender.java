package chap04_02facade;

public class SmsSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("문자 메세지 발송!");
    }
}
