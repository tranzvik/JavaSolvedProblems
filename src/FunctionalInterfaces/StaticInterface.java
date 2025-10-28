package FunctionalInterfaces;

@FunctionalInterface
public interface StaticInterface {

    static void method1(){
        int x =10;
        System.out.println("inside interface");
    }

    public void testMethod();
}
