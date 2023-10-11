package chap02_03stream.map;

import java.util.ArrayList;
import java.util.List;

public class ForMapExampleMain {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 10; i < 41; i += 10) {
            integerList.add(i);
        }

        List<Integer> x10IntegerList = new ArrayList<>();

        for(int i = 0; i < integerList.size(); i++){
            //개별 요소를 반복문으로 접근해 10 곱하고 새 리스트에 add
            x10IntegerList.add(integerList.get(i) * 10);
        }
        System.out.println(x10IntegerList);
    }
}

