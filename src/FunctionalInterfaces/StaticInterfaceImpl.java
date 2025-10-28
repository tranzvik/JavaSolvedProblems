package FunctionalInterfaces;

public class StaticInterfaceImpl implements StaticInterface {

    public static void main(String[] args) {
        StaticInterfaceImpl staticInterface = new StaticInterfaceImpl();
        staticInterface.testMethod();
    }

    public void method1(){
        int x = 2;
        System.out.println("inside class");
    }

    @Override
    public void testMethod() {
        System.out.println("Implemented way");
    }
}
