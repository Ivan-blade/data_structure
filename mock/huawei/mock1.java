package mock.huawei;

import java.util.*;
public class mock1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(2);
        deque.push(1);
        deque.add(3);
        deque.add(4);
        while(!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}