package com.company;

import java.util.*;

import DS.DS.TreeNode;
import enter.yasen.*;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {


        String str1=new String("hello");
        String str2=new String("hello");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str1));










    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        //可以直接用递归的方式来分析
        //定义一个静态的集合
        List<Integer> res = new ArrayList<Integer>();

        while(!res.isEmpty())
        {
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
