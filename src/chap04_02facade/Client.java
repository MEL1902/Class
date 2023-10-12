package chap04_02facade;

public class Client {
//    MessageSender[] senderList = {new KakaoSender(), new EmailSender(), new SmsSender()};
//    SendMessageRepository sendMessageRepository = new SendMessageRepository();
    public void someMethod() {
//        //매체별로 순차적으로 메세지 발송
//        for (MessageSender sender : senderList) {
//            sender.send();
//        }
//    senderList[0].send();
//    senderList[1].send();
//    senderList[2].send();
//
        //복잡한 호출 로직은 모두 클라이언트 측에서 생략하고 파사드 클래스 하나만 생성
        SendMessageFacede sendMessageFacede = new SendMessageFacede();
        sendMessageFacede.sendSave();
    }
}