package chap03_01lsp;

public class Child extends Parents{

    @Override
    public void someMethod(int input) {
        super.someMethod(input);

        //자식은 양수만 처리할 수 있도록 재정의
        if(input <= 0){
            throw new RuntimeException("양수만 받을 수 있습니다.!");
        }

        System.out.println("Child 정상적으로 호출됨");
    }

}


//Solid의 대전제는 Client 코드를 고치지 말자