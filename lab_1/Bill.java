import java.util.*;
import java.text.SimpleDateFormat;



interface Bill_Details
{
void calculate();

}

public class Bill implements Bill_Details
{

int product_id;
String name;
int qtr;
int unit_price ,total;
Bill (int product_id,String name,int qtr,int unit_price ,int total)
{
this.product_id=product_id;
this.name=name;
this.qtr= qtr;
this.unit_price=unit_price;
this.total=total;
}
public  void calculate()
{


System.out.println("\t"+product_id+"\t "+name+"\t"+qtr+"   \t\t"+unit_price+"\t"+total+"\t");

}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the order no");
int e = sc.nextInt();
System.out.println("how many product do you want to add ");
 int n = sc.nextInt();
 Bill arr[] = new Bill[n];
 int net =0;
for (int i=0; i<n; i++)
{
System.out.println("enter the product  id");
int a = sc.nextInt();
System.out.println("enter the product name");
String b = sc.next();
System.out.println("enter the Quantity ");
int c = sc.nextInt();
System.out.println("enter the Unit price");
int d = sc.nextInt();
int total = c*d;
net = net+total;
arr[i] = new Bill(a,b,c,d,total);

}

System.out.println("orderno:"+e);

Date currentDate = new Date();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
System.out.println("Date:"+dateFormat.format(currentDate));
System.out.println("Product id    Name    Quantity    unit price    Total");
System.out.println("________________________________________________________________________________");
for(int i=0;i<n;i++)
{
arr[i].calculate();

}
//Bill b1 = new Bill(101,"A",2,25,50);
//Bill b2 = new Bill(101,"B",1,100,100);
//b1.calculate();
//b2.calculate();
System.out.println("________________________________________________________________________________");

int netamount=0;
for(int i=0;i<n;i++)
{
netamount=netamount+arr[i].total;

}

System.out.println("\t\t\t Net.Amount\t\t"+netamount);

}

}
