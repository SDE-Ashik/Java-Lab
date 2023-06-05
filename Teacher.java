import java.util.*;

 class Employee 
{


String empid;
String name;
int salary;
String adress;
Employee (String empid, String name, int salary , String adress)
{
this.empid = empid;
this.name = name;
this.salary = salary;
this.adress= adress;
}
void display()
{
System.out.println("EMPID :" + empid);
System.out.println("NAME :" + name);
System.out.println("SALARY :" + salary);
System.out.println("ADDRESS :" + adress);

}

}

class Teacher extends Employee
{
 String dep,sub;
Teacher(String empid, String name, int salary , String adress, String dep, String sub)
{

super(empid,name,salary,adress);
this.dep = dep;
this.sub = sub;
}

void display ()
{
System.out.println("\n\n\n\n\n\n\n DETAILs");
super.display();
System.out.println("DEPARTMENT :"+ dep);
System.out.println("SUBJECT :"+ sub);
}
public static void main (String args[])
{
int n;
String a,b,d,e,f;
int c;
System.out.println("how many employees you want to add :");

Scanner obj = new Scanner(System.in);
n = obj.nextInt();
Teacher arr[] = new Teacher[n] ;
for  (int i=0; i<n; i++)
{
	System.out.println("add employee details here");
System.out.println("enter EMPLOYEE id:");
  a = obj.next();
System.out.println("enter EMPLOYEE NAME");
  b = obj.next();
System.out.println("enter EMPLOYEE SALARY");
 c = obj.nextInt();
System.out.println("enter EMPLOYEE ADDRESS");
  d = obj.next();
System.out.println("enter EMPLOYEE DEPARTMENT");
  e = obj.next();
System.out.println("enter EMPLOYEE SUBJECT");
  f = obj.next();
arr[i] = new Teacher(a,b,c,d, e, f);

}

for(int i=0; i<n;i++)
{
arr[i].display();
}
Teacher t1 = new Teacher("ee1","abu",8674669,"mannth house", "computer science", "java");
t1.display();


}
}







