package chap01_03abstractlayer.abstract_class;

public abstract class AbstractClass {
    public void implementedMethod() {
        System.out.println("AbstractClass implemented Method");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
