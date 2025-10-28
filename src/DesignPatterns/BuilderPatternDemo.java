package DesignPatterns;

public class BuilderPatternDemo {
    String name;
    String deptName;


    BuilderPatternDemo(EmployeeDetails employeeDetails) {
        this.name = employeeDetails.empName;
        this.deptName = employeeDetails.empDept;

    }

    static class EmployeeDetails {
        String empName;
        String empDept;


        EmployeeDetails() {
            this.empDept = "Dept_temp";
            this.empName = "empName_temp";
        }

        public EmployeeDetails setEmpDepartment(String deptName) {
            this.empDept = deptName;
            return this;
        }

        public EmployeeDetails setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public BuilderPatternDemo build() {
            return new BuilderPatternDemo(this);
        }
    }

    public static void main(String[] args) {

        new BuilderPatternDemo.EmployeeDetails().setEmpDepartment("test1").setEmpName("test2").build();
    }
}
