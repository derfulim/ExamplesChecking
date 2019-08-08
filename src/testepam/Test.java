package testepam;

import java.util.ArrayList;
import java.util.List;

public class Test {
}

class StringTest {
    public static void main(String[] args) {
        String name = new String("Paul");
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
    }
}

class StringBuilderUsage{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2,"r");
        System.out.println(sb1);
    }
}

class IntegerHashCode{
    public static void main(String[] args) {
        Integer i = 5000;
        System.out.println(i.hashCode());
    }
}

class Test1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a=b);
    }
}

class Loop{
    public static void main(String[] args) {
        int num =10;

        do{++num;}
        while (++num>20);

        System.out.println(num);
    }
}

class DefaultArrayValues{
    public static void main(String[] args) {
        int arint[] = new int[5];
        String arstr[] = new String[5];
        boolean arbol[] = new boolean[5];
        char arch[] = new char[5];
        double [] ardob = new double[5];
        float [] arflo = new float[5];
        System.out.println(arint[0]);
        System.out.println(arstr[0]);
        System.out.println(arch[0]);
        System.out.println(arbol[0]);
        System.out.println(ardob[0]);
        System.out.println(arflo[0]);
    }
}

class Test2{
    public static void main(String[] args) {
        int x = 0;

        System.out.println(++x == x++);
    }
}

class Casting{
    public static void main(String[] args) {
        List intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        List list = intList;
        list.add("hello");

        for (Object o:list
             ) {
            System.out.println(o + " ");

        }
    }
}

enum Direction{SOUTH,NORTH}

class Test3{
    public static void main(String[] args) {
//        System.out.println(Direction.valueOf(1));
    }
}

enum CoffeeSize{BIG, HUGE, OVERHELMING};

class Test4 {
    public static void main(String[] args) {
        CoffeeSize cs = CoffeeSize.BIG;
        System.out.println(cs.HUGE);
    }
}

class Test5{
    public static void main(String[] args) {

        Integer i = new Integer(100);
        Integer i2 = new Integer("1");
        System.out.println(i+i2);
    }
}

class A{
    protected int v = 1;

}

class B extends A{
    protected int v = 2;
    {
        System.out.println(v);
    }

    public static void main(String[] args) {
        new B();
    }
}

/*
private class Hope{
    public static void main(String[] argv) {
        for (int i = 0; i<2; i++) {
            System.out.println(i);
        }

    }
}*/

/*class ThreadExample{
    public static void main(String[] args) throws Exception {
        new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }
        run();
    }
}*/

class Test6{
    public static void main(String[] args) {
        int array [] = new int [2];

        System.out.println(array[-10]);
    }
}

class Employee{
//    public int daysOffWork(String...months, int ... days) {}
}

class C {
    public static void main(String[] args) {
        C c = new C();
        c.met(5,2);
    }

    void met(int a, int b) {
        b*=a;
        a+=b;
        System.out.println(a);
    }
}

class Phone{

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.isTested());
    }
    boolean tested;

    public void setTested (boolean val) {
        tested = val;
    }

    public boolean isTested() {
        return tested;
    }
}

class Box {
    int b,w;
    public Box(int b, int w) {
        this.b = b;
        this.w = w;
    }
}

class MyBox  extends Box {
    public static void main(String[] args) {
        new MyBox();
    }
    MyBox() {
        super(10,15);
        System.out.println(b + " " + w);
    }
}

class OverAndOver {
    static String s = "";

    public static void main(String[] args) {
        try{s+="1";
        throw new Exception();}
        catch (Exception e) {
            s+="2";
        }
        finally {
            s+="3";
            doStuff();
        }

        System.out.println(s);
    }

    static void doStuff() {
        int x = 0;
        int y = 7/0;
    }
}

class Parent{
    public void job() {
        System.out.println("Parent");
    }
}

class Child extends Parent{

    public void job (int i) {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.job();
    }
}