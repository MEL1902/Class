package chap03_01lsp;

public class LspExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        Parents parents = new Parents();
        Child child = new Child();

        //Child로 바꾸게 된다면, Client측에서 음수를 매개변수로 넘겨주던 부분을
        //양수로 고쳐줘야만 정상 동작하게 되므로, 결국 양쪽 모두를 고쳐야만 개선됨
        client.someClientMethod(child);
    }
}
