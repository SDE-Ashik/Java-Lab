import java.util.*;
class Employee2 {
    int enumber,k=1;
    String ename;
    double salary;
    void details()
    {
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

    void show()
    {
        System.out.println("Current details of Employee id  "+enumber);
        System.out.println("NAME:"+ename.toUpperCase());
        System.out.println("Salary:"+salary);
    }
public static void main(String args[])
{
    Scanner obj = new Scanner(System.in);
    
    System.out.println("how many employees do you want create:");
    int n =obj.nextInt();
    
    Employee2 [] emp = new Employee2[n];

    for(int i =0;i<n;i++)
    {
        emp[i] = new Employee2();
        emp[i].details();
    }
    System.out.println("do you want find employee details then enter the Employee id :");
    int search = obj.nextInt();
    boolean found =false;
    for (int i =0;i<n;i++)
    {
        
        if(search == emp[i].enumber)
        {
            // emp[i] =new Employee();
            emp[i].show();
            found = true;
            break;
        }
    }
    if (!found)
    {
        System.out.println("invalid choice");
    }
}
}
