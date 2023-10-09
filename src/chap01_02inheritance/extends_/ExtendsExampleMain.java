package chap01_02inheritance.extends_;

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent(); // 부모타입 변수에 부모타입 객체 대입
        // 오른쪽은 대입받은 instance 이다.
        Parent parentTypeChild = new Child(); //부모타입 변수에 자식타입 객체 대입
        Child child = new Child(); //자식타입 변수에 자식타입 객체 대입
        //디버거 사용 학습용 변수
        int a;

        parent.someMethod();
        a = 10;
        System.out.println("----------");
        parentTypeChild.someMethod();
        // parentTypeChild.anotherMethod(); // Child타입 객체 내부 요소는 Parent 타입 변수로 호출 불가능
        System.out.println("----------");
        child.someMethod();      // child 는 some , another Method 둘다 가능
        child.anotherMethod();
    }
}
