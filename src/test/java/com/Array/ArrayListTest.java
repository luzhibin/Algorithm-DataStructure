package com.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luzhibin on 2020/3/30 10:39
 */
public class ArrayListTest {

    @Test
    public void test(){

        List<Integer> list1;
        Integer[] a = {7, 4, 3, 12, 9,};
        list1 = Arrays.asList(a);
        System.out.println("遍历list1的所有元素【Version1】：");
        for (int item : list1){
            System.out.print(item+" ");
        }
        System.out.println("\n遍历list1的所有元素【Version2】：");
        for (int i = 0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\n-----------------------------------------------------------");
        Integer[] b = {11,22,33,44,55,66};
        List<Integer> list2 = new ArrayList<>(Arrays.asList(b));
        System.out.println("遍历List2"+list2+"的所有元素:");
        for (Integer integer : list2) {
            System.out.print(integer+" ");
        }
        System.out.println("\n-----------------------------------------------------------");
        List list3 = new ArrayList<>();
        System.out.println("list3.size():"+list3.size());
        for (int i=10;i<100;i += 10){
            list3.add(i);
            System.out.println("list3的size："+list3.size());
        }
        for (Object item : list3) {
            System.out.println(item);
        }
    }
}
