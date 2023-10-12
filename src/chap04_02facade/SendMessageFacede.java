package chap04_02facade;

public class SendMessageFacede {
        MessageSender[] senderList = {new KakaoSender(), new EmailSender(), new SmsSender()};
    SendMessageRepository sendMessageRepository = new SendMessageRepository();


    public void sendSave(){
                for (MessageSender sender : senderList) {
            sender.send();
        }
    }
}
