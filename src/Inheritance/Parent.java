package Inheritance;

public class Parent {
     int counter = 0;

    Parent() {
        System.out.println("Inheritance.Parent Contructor");
        counter++;
    }

    public void parentMethod() {
        System.out.println("parentMethod");
    }

    public void testMethod1() {
        System.out.println("TestMethod1 in parent class");
    }

    public void incrementCounter() {
        counter++;
    }

    public void getCounterValue() {
        System.out.println("Counter:"+counter);
    }

}
