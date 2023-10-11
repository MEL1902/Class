package chap03_01lsp;

public class Client {
    public void someClientMethod(Parents parentsOrChild){
        //부모가 할 수 있는 자식도 할 수 있어야 한다.
        parentsOrChild.someMethod(-1);
    }
}
