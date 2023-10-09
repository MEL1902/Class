package chap01_01oopdesc.with_interface;

//모든 종류의 MessageSender를 대입받을 수 있는 MessageSender 인터페이스
public interface MessageSender {
    //인터페이스는 특정 객체가 가져야하는 기능의 명세를 작성합니다.
    //인터페이스 내부에 작성한 메서드는 구현체가 반드시 구현해야 하는 메서드로 정의됩니다.

    void send(); //MessageSender라면 무조건 발송기능을 가져야한다.
}
