package chap01_02inheritance.extends_;
//상속을 전제로 하기때문에 extends Praent
public class Child extends Parent{
// Parent쪽 자원은 private 요소를 제외한 나머지를 모두 가집니다.

    //Child쪽에서 새롭게 정의하는 메서드

    public void anotherMethod(){
        System.out.println("Child anotherMethod");

        this.parentPublicInt = 0;
        this.parentProtectedInt = 0;
        //private 요소는 부모 자식 관계 에서도 호출할 수 없습니다.
        //this.parentPrivateInt = 0;
    }
}
