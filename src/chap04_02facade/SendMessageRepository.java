package chap04_02facade;

//발송된 메세지 내역을 DB에 적재하는 레포지토리
public class SendMessageRepository {

    public void save(){
        System.out.println("발송된 모든 메세지 내역은 디비에 자정되었습니다.");
    }
}
