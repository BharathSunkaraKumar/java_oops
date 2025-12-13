package interfaces;
import java.util.*;
public class Queuee {
    public static void main(String[] args) {
        System.out.println("Quees");
        System.out.println("----------priority Queue----------");
        //Comparator.reverseOrder() it return max value [ Comparator.reverseOrder() ]
        PriorityQueue<Integer> numbs = new PriorityQueue<>(); //it's return least value form this array by using minimum heap

        numbs.add(18);
        numbs.add(50);
        numbs.add(2);
        numbs.add(1);
        numbs.add(10);
        System.out.println(numbs.offer(5000)); //it return's true add add 5000 value by assigned array

        System.out.println(numbs);
//        numbs.poll();
        numbs.offer(550);//adding element to array

        System.out.println(numbs.peek());
        System.out.println(numbs.poll());
        System.out.println(numbs.offer(50));

        System.out.println(numbs);

    }
}
