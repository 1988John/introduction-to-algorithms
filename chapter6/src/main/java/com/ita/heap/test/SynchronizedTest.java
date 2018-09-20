package com.ita.heap.test;

public class SynchronizedTest {

    public static synchronized void doSth() {
        System.out.println("Hello World");
    }

    public void doSth1() {
        synchronized (SynchronizedTest.class) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        String a2 = "hello2";

        final String b2 = "hello";

        String c2 = "hello";


        System.out.println(a2 == (b2 + 2));

        System.out.println(a2 == (c2 + "2"));


        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        System.out.println("a == b:" + (a == b)); //false
        System.out.println("a == c:" + a == c); //false
        System.out.println("a == d:" + (a == d)); //false
        System.out.println("b == c:" + b == c); //false
        System.out.println("b == d:" + (b == d)); //false
        System.out.println("c == d:" + (c == d)); //false
    }
}