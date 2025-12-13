package interfaces;

import java.util.*;

public class DequeLL {
    public static void main(String[] args) {
        System.out.println("--------deque----------");
        Deque<Integer> nums = new LinkedList<>();
        nums.offer(10);
        nums.add(55);
        nums.offer(18);
        nums.push(1);
        nums.pop();
        System.out.println(nums);
    }
}
