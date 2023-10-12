package chap04_04proxy;

public class ProxyPatternMain {
    public static void main(String[] args) {
        //실제 객체를 만들어서 돌리는 케이스
//        Service service = new Service();
//        Client client = new Client(service);

        //클라이언트 코드의 변경 없이 전후 로직 추가하기
        Proxy proxy = new Proxy();
        Client client = new Client(proxy);

        client.setSomeInterface();
    }
}
