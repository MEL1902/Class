package chap02_03stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForIterationExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for(int i = 10; i < 80; i += 10){
            integerList.add(i);
        }

//        integerList.add(10);
//        integerList.add(20);
//        integerList.add(30);
//        integerList.add(40);
//        integerList.add(50);
//        integerList.add(60);
//        integerList.add(70);


        for(int i = 0; i < integerList.size(); i++){
            System.out.println(integerList.get(i));
            if(integerList.get(i) == 40){
                System.out.println("40찾았다!");
                break;
            }
        }
    }
}
