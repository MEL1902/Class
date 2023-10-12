package chap04_04proxy;

public class Client {

    private final SomeInterface someInterface;

    public Client(SomeInterface someInterface){
        this.someInterface = someInterface;
    }

    public void setSomeInterface(){
        someInterface.someMethod();
    }
}
