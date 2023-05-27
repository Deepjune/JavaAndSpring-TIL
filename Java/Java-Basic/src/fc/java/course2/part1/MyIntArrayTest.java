package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // 예외발생 -> 배열의 길이(2배)를 늘려주는 작업 필요

        System.out.println(list.get(0)); // 1
        System.out.println(list.get(1)); // 2
        System.out.println(list.get(2)); // 3

        System.out.println(list.size()); // 3
    }
}
