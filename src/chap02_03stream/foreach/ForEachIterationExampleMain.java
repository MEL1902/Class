package chap02_03stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachIterationExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 10; i < 80; i += 10) {
            integerList.add(i);
        }

        integerList.stream().forEach(integer -> {// integer변수는 매 바퀴마다 10,20,30...번갈아가면서 대입받음
            System.out.println(integer); //콘솔창에 해당 값을 찍어줌
            if(integer == 40){
                System.out.println("40 찾았다!");
                throw new RuntimeException("이러면 멈추긴 하는데...");
            }

        });
    }
}