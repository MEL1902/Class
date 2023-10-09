package chap01_01oopdesc.with_interface;
//구현체이기에 implements 를 넣는다
public class FakeMessageSender implements MessageSender{

    @Override
    public void send() {
        System.out.println("FakeMessageSender, 실제로는 메세지를 발송하지 않습니다.");
    }
}
