package chap01_07optional.without_optional;


public class WithoutOptionalExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
                                            //존재 하지 않는 키 값으로 조회
        String string = mapRepository.getValue("EXIST_KEY");

        System.out.println("string=" + string);

        //얻어온 value값을 싹 다 대문자로 바꿔서 출력
        System.out.println(string.toUpperCase());
    }
}
