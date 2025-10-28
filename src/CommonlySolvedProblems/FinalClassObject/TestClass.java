package CommonlySolvedProblems.FinalClassObject;

public class TestClass {

    public void createEmp() {
        final Employee emp = new Employee("test", 23);
        emp.setAge(45);
        System.out.println(emp.age);
    }

    public static void main(String[] args) {
        new TestClass().createEmp();
    }
}
