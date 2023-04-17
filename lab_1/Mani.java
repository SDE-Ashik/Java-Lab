import java.util.*;
class Mani
{
int ch;
void manu()
{
Scanner sc = new Scanner(System.in);


String a ;


do 
{System.out.println("enter the string");
a = sc.next();
System.out.println("STRING METHODS \n 1.toupper \n 2.tolower\n3.replace \n4.concatination \n 5.length \n6.convert to charaaray \n 7.index of substring  ");
System.out.println("select any option");
ch = sc.nextInt();
switch(ch)
{
case 1:
	System.out.println(a.toUpperCase());break;
case 2: 

System.out.println(a.toUpperCase());break;
case 3:System.out.println("enter a string to replace");
String b =sc.next();
System.out.println("what you want to replace:");
 String c = sc.next();
System.out.println(a.replace(b,c));
break;
case 4:
String s;
System.out.println("enter a string to concatnation");
s =sc.next();
System.out.println(a.concat(s));break;
case 5:

System.out.println("length of string "+a+" is "+a.length());break;



case 6:
char charray[] = a.toCharArray();
System.out.println("convert to char array");
for(char i : charray)
{
System.out.println(i);
}
break;
default:
System.out.println("invalid");

}}
while(ch!=1);
}
public static void main(String args[])
{
Mani m1 = new Mani();
m1.manu();
}
}
