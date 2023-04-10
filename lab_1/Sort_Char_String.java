import java.util.*;

class Sort_Char_String {

    void string_from_char()
    {
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char  arr [] = str.toCharArray();
        Arrays.sort(arr);
        
        System.out.println("Sort character from string is \n "+Arrays.toString(arr));

    }

public static void main(String args[])
{
    Sort_Char_String s1 = new Sort_Char_String();

    s1.string_from_char();
}
}
