package Inheritance;

public class Child1 extends Parent {
    Child1() {
        super();
        System.out.println("Inheritance.Child1 contructor");
    }

    public void testMethod1() {
        System.out.println("TestMethod1 in Child class");
    }

    public void child1Method() {
        System.out.println("child1Method");
    }
}
