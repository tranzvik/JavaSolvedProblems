package CommonlySolvedProblems.InterfaceProblem;

public abstract class TestClass implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("method1 overridden");
    }

    public void method2() {
        System.out.println("method2 overridden");
    }

    public void method3() {
        System.out.println("method3 overridden");
    }

    public void method4() {
        System.out.println("method4 overridden");
    }

    //not implementing method 4 and 5.
}
