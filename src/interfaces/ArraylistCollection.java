package interfaces;

import java.util.ArrayList;

public class ArraylistCollection {
    public static void main(String[] args) {
        System.out.println("array list");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(18);
        nums.add(7);

        System.out.println("before changed the value in nums: "+nums);
        nums.add(0, 3); // add a element at specific index by using add method
        System.out.println(nums);
        System.out.println("--------------add()---------------");

        nums.add(11);
        System.out.println("add method used for append a specific element to the end of a list :"+nums);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1000);
        nums1.add(2000);
        nums1.add(1000);
//        nums.addAll(nums1);
        System.out.println("--------------addAll()---------------");
        nums.addAll(1, nums1); // add collection of array to another array by using addAll() method ar specific index
        System.out.println(nums);

//        nums.clear(); this method is used to remove all the elements from any list
        System.out.println("-----------clone()------------------");
        ArrayList<Integer> nums2 = (ArrayList<Integer>) nums.clone();
        System.out.println(nums);
        System.out.println("-----------------------------");
        System.out.println("clone arraylist: "+nums2);
//        System.out.println(nums.get(0).equals(nums2.get(0)));
        System.out.println("--------------contians()---------------");
        System.out.println(nums.contains(1));//if list contains the specified element
        System.out.println("------------forEach-----------------");
        for(Integer num: nums) {
            System.out.println(num);
        }
        System.out.println("--------------get()---------------");
        System.out.println(nums.get(3)); //returns the element at the specified position in this list
        System.out.println("------------indexOf()-----------------");
        System.out.println(nums.indexOf(1000));
        System.out.println("-------------lastindexof()----------------");
        System.out.println(nums.lastIndexOf(1000));
        System.out.println("--------------isEmpty()---------------");
        System.out.println(nums.isEmpty());
        System.out.println("---------------remove()--------------");
        System.out.println(nums.remove(3));
        System.out.println("after removeing element at index 3:" + nums);
        System.out.println(nums.add(1000));
        System.out.println(nums);
        System.out.println("---------------remove by element--------------");
        nums.removeAll(nums1);
        System.out.println("after removeing all elements : " + nums);
        System.out.println("---------------size() of the elements--------------");
        System.out.println(nums.size());
    }
}
