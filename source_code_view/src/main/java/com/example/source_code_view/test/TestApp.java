package com.example.source_code_view.test;

import org.junit.jupiter.api.Test;

public class TestApp {
    private int hash(int i) {
        return ((i + 2) << 2 % 8) ^ 5;
    }

    private int hash(String str) {
        int hashcode = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            hashcode += hash(aChar);
        }
        return hashcode;
    }


    @Test
    public void test001() {
        System.out.println(hash(2));
        System.out.println(hash(10));
        System.out.println(hash(11));
        System.out.println(hash(12));
        System.out.println(hash(13));
        System.out.println(hash(14));
        System.out.println(hash(15));
        System.out.println(hash(16));
        System.out.println(hash(17));
    }

    @Test
    public void test002(){
        System.out.println(hash("大爷，楼上322是马冬梅家吗？"));
        System.out.println(hash("马什么梅呀？"));
        System.out.println(hash("马冬梅"));

        System.out.println(hash("2"));
        System.out.println(hash("3"));
        System.out.println(hash("4"));
        System.out.println(hash("5"));

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);

        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println(i1==i3);
        System.out.println(i4==i3);

        String s1 = new String("123");
        String s2 = new String("123");
        String s3 = "123";
        String s4 = "123";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

    }
}
