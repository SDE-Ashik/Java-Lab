 import java.util.*;

public class Mark {
    int []mark =new int[100];
    String []name = {"C++","English","java","PYTHON","math","art","science","history","music","geography"};
    int n,i=1,total=0;
    double p;
    String na;
    void data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of student:");
        na = sc.next();
        System.out.println("enter total the number of subject ");
       
        n =sc.nextInt();
        System.out.println("enter the mark out of 100");
        while(i<=n)
        {
            System.out.println("enter the mark of "+name[i]);
            mark[i]=sc.nextInt();
            if(mark[i]<=100)
            {
                mark[i]=mark[i];
                total=total+mark[i];
                i++;
            }
            else
            {
                System.out.println("enter valid score");
            }
        }
    }

    void  mark_list()
    {
        System.out.println("\t\t mark list ");
        System.out.println("name:\t \t \t\t"+na.toUpperCase());
        System.out.println("Subject  \t \t\tmarks");
        for(int j=1;j<=n;j++)
        {
            System.out.println(name[j]+"\t\t\t\t "+mark[j]);
        }
        System.out.println("total score:\t \t \t"+total);
        double p = ((total*100)/(n*100));
        System.out.println("percentage:\t \t \t"+p+"%");
        System.out.print("Grade:\t \t \t");
        if(p>90)
        {
            System.out.println("\tA+");
        }
        else if(p>80)
        {
            System.out.println("\tA");
        }
        else if (p>70)
        {
            System.out.println("\tB+");
        }
        else if(p>60)
        {
            System.out.println("\tB");
        }
        else if(p>50)
        {
            System.out.println("\tC+");
        }
        else 
        {
            System.out.println("\tFailed");
        }
        
        
    }
 
    
    public static void main(String args[])
    {
        Mark m1 = new Mark();
        m1.data();
        m1.mark_list();
    }
}
