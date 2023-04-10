import java.util.*;

class Employee {
    int enumber,k=1;
    String ename;
    double salary;

    Employee(int enumber, String ename, double salary) {
        this.enumber = enumber;
        this.ename = ename;
        this.salary = salary;
    }

    void show() {
        System.out.println("Current details of Employee id  "+enumber);
        System.out.println("NAME:"+ename.toUpperCase());
        System.out.println("Salary:"+salary);
    }
}

public class EmployeeDetails {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
        
        System.out.println("how many employees do you want create:");
        int n = obj.nextInt();
        
        for(int i = 0; i < n; i++) {
            System.out.println("Enter employee details:");
            System.out.println("Employee number:");
            int enumber = obj.nextInt();
            obj.nextLine(); // consume newline
            System.out.println("Employee name:");
            String ename = obj.nextLine();
            System.out.println("Employee salary:");
            double salary = obj.nextDouble();
            Employee emp = new Employee(enumber, ename, salary);
            empMap.put(enumber, emp);
        }
        
        System.out.println("do you want find employee details then enter the Employee id :");
        int search = obj.nextInt();
        Employee emp = empMap.get(search);
        if (emp == null) {
            System.out.println("Invalid employee id");
        } else {
            emp.show();
        }
    }
}
