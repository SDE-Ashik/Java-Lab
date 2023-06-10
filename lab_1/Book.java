import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Publisher
{
  private String name;
  public Publisher(String name)
  {
    this.name= name;
  }
  public String getname()
  {
    return name;
  }
}

class Book
{
  Publisher publish;
  double price;
  String title;
  String category;

Book(Publisher publish,String title,double price)
{
  this.publish = publish;
  this.price=price;
  this.title=title;
 category="general"; 

}
String category()
{
  return "General";
}

void display()
{
System.out.println("\t\t\t\t Book details");
System.out.println("Title:"+title);
System.out.println("Publisher name:"+publish.getname());
System.out.println("Price:"+price);
System.out.println("category:"+category());
}
}

class Fiction extends Book{
  Fiction(Publisher publish,String title,double price)
  {
    super(publish, title,price);
    
  }
String category()
{
  return "Fiction";
}
  }

class Literature extends Book
{
  Literature(Publisher publish,double price,String title)
  {
    super(publish, title, price);
  }
  String category()
  {
    return "Literature";
  }
}

class Show
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("add publisher name :");
    String a = sc.nextLine().toUpperCase();
    System.out.println("add book name:");

    String b = sc.nextLine().toUpperCase();
    System.out.println("add book price:");
    double c = sc.nextDouble();
    System.out.println("which category do you want add this book  \n 1.Fiction \n 2.Literature \n 3.General");
    System.out.println("select any one :");
    
    int d = sc.nextInt();
    if (d==2) {
      
      Book b1= new Literature(new Publisher(a),c,b);
      b1.display();
    }
    else if (d==1)
    {
      Book b2 = new Fiction(new Publisher(a), b,c);
      b2.display();
    }
    else {
      Book b1= new Book(new Publisher(a),b,c);
      b1.display();
    }
  }
}
