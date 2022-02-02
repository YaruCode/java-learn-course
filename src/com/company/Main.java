package com.company;

import java.util.*;

import enter.yasen.*;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {

//        Animal dog = new Dog();
//        dog.Eat();
//        dog.Run();
//        dog.Shout();
//
//        Cat cat = new Cat();
//        cat.Eat();
//        cat.Run();
//        cat.Shout();
//        cat.set_color(Color.Black);

//        System.out.println(cat.get_color().toString());

        //BitSet 数据结构
//        BitSet set = new BitSet();
//        set.set(2);
//
//        Vector<Integer> vector = new Vector<>();
//        vector.add(12);
//        vector.add(22);
//
//
//        while (!vector.isEmpty()) {
//            System.out.println(vector.elementAt(0));
//            vector.remove(0);
//        }
//        boolean flag = vector.stream().allMatch(x -> x > 3);

//        Collection<String> coll = new ArrayList<>();
//        coll.add("dog");
//        coll.add("cat");
//        coll.add("sheep");
//
//        Iterator<String> iter = coll.iterator();
////       while(iter.hasNext())
////       {
////           System.out.println(iter.next());
////       }
//
////        HashSet<String> set=new HashSet<>();
////        set.add("S");
////        set.add("c");
////        set.add("b");
////        set.add("b");
////        set.add("b");
////        set.add("b");
////        for(String s:set)
////        {
////            System.out.println(s);
////        }
//
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("ten", 10);
//        map.put("seven", 7);
//
//        for (String s : map.keySet()) {
//        //    System.out.println(map.get(s));
//        }
//
//
//        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
//        map1.put("one", 1);
//        map1.put("six", 6);
//        map1.put("two", 2);
//
//        Integer i=map.get("six");
//
//        map1.put("six",i+1);
//
//        for(String s:map1.keySet())
//        {
//            System.out.println(map1.get(s));
//        }
////        for(Map.Entry<String,Integer> entry :map1.entrySet())
////        {
////            System.out.println(entry.getValue());
////        }
//
//
//        Integer[] data=new Integer[10];

//    int a=1;
//    int b=2;
//    int res=Add(a,b);
//    //Incre(res);
//    Inc(res);
//    System.out.println(res);
//TryCatchMethod();


        List<Integer> res=new ArrayList<>();
        res.add(1);
        assert 2==1:"2！=1";


    }

    public static void TryCatchMethod() {
        int a = 1;

        try {
            int res = a / 0;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        } finally {

System.out.println("finally");
        }


    }


    static void Inc(Integer a) {
        ++a;
    }

    static void Incre(int a) {
        ++a;
    }


    public int Add(int a, int b) {
        return a + b;
    }

    public static int Multiply(int a, int b) {

        return a * b;
    }


}
