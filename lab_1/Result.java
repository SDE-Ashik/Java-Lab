import java.util.Scanner;

class Student
{
String name;
int rollno;
double mark;

Student(String name,int rollno,double mark)
{
    this.name=name;
    this.rollno=rollno;
    this.mark=mark;
}

void display()
{
    System.out.println("name:"+name);
    System.out.println("rollno:"+rollno);
}

}
class Sports
{
String sportsname;
int sports_mark;
Scanner sc1= new Scanner(System.in);
Sports(String Sportsname,int Sports_mark)
{
    this.sportsname=Sportsname;
    this.sports_mark=Sports_mark;

}
void display()
{
    
System.out.println("sportsname:"+sportsname);
System.out.println("sports mark:"+sports_mark);
}
}

class Result extends Student
{
Sports sport;
Result(String name,int rollno,double mark,Sports sport)
{
    super(name, rollno,mark);
    this.sport=sport;
}
void details()
{
    System.out.println("--------Accademic Details---");
    display();
    System.out.println("---------Sports Details----");
    sport.display();
}
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the student name:");
    String name=sc.next();
    System.out.println("enter the student rollno:");
    int rollno=sc.nextInt();
    System.out.println("enter the student mark:");
    double mark=sc.nextDouble();
    System.out.println("enter the sports name:");
    String sportsname=sc.next();
    System.out.println("enter the sports mark:");
    int sports_mark=sc.nextInt();
    Sports sport=new Sports(sportsname,sports_mark);
    Result result=new Result(name,rollno,mark,sport);
    result.details();
    }
     
}
