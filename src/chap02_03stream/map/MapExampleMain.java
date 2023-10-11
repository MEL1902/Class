package chap02_03stream.map;

import java.util.ArrayList;
import java.util.List;

public class MapExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 10; i < 41; i += 10) {
            integerList.add(i);
        }

        List<Integer> x10IntegerList = integerList.stream() //개별 요소를 어떻게 리턴할지 람다로 작성
                                                        .map(integer -> integer * 10).toList();
        System.out.println(x10IntegerList);
    }
}
