package chap01_02inheritance.overriding;

//상속을 전제로 하기때문에 extends Praent
public class Child extends Parent {
    //부모쪽 메서드와 시그니처(메서드명, 리턴자료형, 파라미터의 종류 등) 은 같으나 실행 구문이 달라짐

    @Override
    public void someMethod(){
        System.out.println("Child someMethod()");
    }
}


//
//// Parent쪽 자원은 private 요소를 제외한 나머지를 모두 가집니다.
//
//    //Child쪽에서 새롭게 정의하는 메서드
//
//    public void anotherMethod(){
//        System.out.println("Child anotherMethod");
//
//        this.parentPublicInt = 0;
//        this.parentProtectedInt = 0;
//        //private 요소는 부모 자식 관계 에서도 호출할 수 없습니다.
//        //this.parentPrivateInt = 0;
//    }
//}
