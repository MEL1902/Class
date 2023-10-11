package chap02_03stream.filter_;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 10; i < 80; i += 10) {
            integerList.add(i);
        }

        Integer findNUmber = integerList.stream().filter(integer -> {
            System.out.println(integer);

            if(integer.equals(40)){
                return true; // true를 리턴하면 결과 풀에 필터로 찾는 자료가 맞음이 인증
            }
            return false; // false를 리턴하면 결과 풀에서 거를 자료라는 인증
        }).findAny().get(); //findAny()로 전체 데이터를 optional로 리턴한 다음, 래핑을 없애기 위해 .get()
        System.out.println("findNumber=" + findNUmber);
    }
}
