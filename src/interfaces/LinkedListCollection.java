package interfaces;

import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        System.out.println("--------Linked List---------");
        List<String> superHeros = new LinkedList<>();
        superHeros.add("Iron Man");
        superHeros.add("Super Man");
        superHeros.add("Bat Man");
        superHeros.add("Caption America");
        superHeros.add("Wolverine");
        superHeros.add("Dead Pool");
        superHeros.add("punisher");
        superHeros.add("Dare Devil");
        superHeros.add("Spider Man");
        for(String superHero: superHeros) {
            System.out.println(superHero);
        }
        System.out.println("----------------------");
        List<Integer> nums = new ArrayList<>();
        nums.add(18);
        nums.add(1);
        System.out.println(nums);
        nums = new LinkedList<>();
        nums.add(12);
        System.out.println(nums);

    }
}
