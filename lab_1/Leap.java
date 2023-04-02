 import java.util.*;
import java.time.*;

public class Leap {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the initial year");
         int first = sc.nextInt();
         System.out.println("enter final year");
         int last = sc.nextInt();
         System.out.println("leap year between"+first+"and"+last);
         for(int i=first;i<last+1;i++)
         {
            if(Year.of(i).isLeap() )
            {
                System.out.println(i);
            }
         }
    }
    
}
