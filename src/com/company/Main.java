package com.company;

import java.util.*;
import java.util.stream.Collectors;

import DS.DS.TreeNode;
import enter.yasen.*;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {


        String str1 = new String("hello");
        String str2 = new String("hello");


//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str1));


//        System.out.println(16>>2);

//        char[] data=new char[10];
//
//        List<Character> res  =new ArrayList<>();
//
//        res.add((char)2);
//        res.add((char)1);
//        res.add('c');
//        System.out.println( res.toString());
//
//        isPowerOfFour(16);

//
//        int a=3;
//        int b=6;
//
//        System.out.println("before");
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println("after");
//        a=a^b;
//        b=b^a;
//        a=a^b;
//
//
//
//
//        System.out.println(a);
//        System.out.println(b);

//        int a=5;
//        findComplement(a);

        //System.out.println(3^3^2);

        Arrays.asList list;
        list = new Arrays.asList("sds", "Dsds");
        Map<Integer,String> map=new HashMap<>();
        Collection<String> values = map.values() ;
        Map.Entry entry;
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        Test();


    }

    public static int NumberOfOne(int a) {
        int cnt = 0;
        while (a != 0) {
            cnt++;
            a = a & (a - 1);//这句话表示从a的二进制中从右往左数，取i+1位置上的值
        }
        return cnt;
    }

    public static int findComplement(int num) {

        //可以利用补码的一个特点来计算
        /**
         1.首先保存下来原始的数字
         2.然后计算这个数字是2的n次幂
         3.然后计算2的n+1次幂
         5.做差


         */
        //1.保存变量
        int temp = num;
        //2.计算给定的数字是几次幂
        int index = 0;
        while (num > 0) {
            num >>= 1;
            index++;
        }
        //3.计算2的index+1次幂
        int i = 1;
        int res = i << index;
        return res - num - 1;

    }

    public static void Test() {
    Map<Integer,Integer> map=new HashMap<>();
    map.put(-1,2);
    for(Map.Entry<Integer,Integer> entrry: map.entrySet())
    {


    }



    }

    public static ArrayList<Character> toBinary(int num) {
        ArrayList<Character> res = new ArrayList();
        while (num != 0) {
            res.add((char) (num % 2));
            num /= 2;
        }
        
        return res;
    }

    public static boolean isPowerOfFour(int n) {
        /**


         */

        while (n != 0) {
            n = n >> 2;
            if (n % 4 != 0) {
                return false;
            }
        }
        return true;

    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        //可以直接用递归的方式来分析
        //定义一个静态的集合
        List<Integer> res = new ArrayList<Integer>();


        while (!res.isEmpty()) {
            System.out.println(res.get(0));
            res.remove(0);
        }

        return null;
    }

    public static void ListSet(List<Integer> list) {

        list.add(1);
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
