import java.util.*;

class Employee1{
    int enumber, k = 1;
    String ename;
    double salary;

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("enter the employee number : ");
        enumber = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of employee :");
        ename = sc.nextLine();
        System.out.println("enter the salary :");
        salary = sc.nextDouble();
    }

    void show() {
        System.out.println("Current details of Employee id  " + enumber);
        System.out.println("NAME:" + ename.toUpperCase());
        System.out.println("Salary:" + salary);
    }

public static void main(String args[])
{
    Scanner obj = new Scanner(System.in);
    Map<Integer,Employee1> empmap = new HashMap<>();
    
    System.out.println("how many employees do you want create:");
    int n =obj.nextInt();
    
    Employee1 [] emp = new Employee1[n];

    for(int i =0;i<n;i++)
    {
        emp[i] = new Employee1();
        emp[i].details();
        empmap.put(emp[i].enumber,emp[i]);
    }
     
    System.out.println("do you want find employee details then enter the Employee id :");
    int search = obj.nextInt();
    Employee1 emp1 = empmap.get(search);
    if (emp1 == null) {
        System.out.println("Invalid employee id");
    } else {
        emp1.show();
}
}
}
