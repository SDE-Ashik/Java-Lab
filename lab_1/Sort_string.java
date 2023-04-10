import java.util.*;

class Sort_string {
    int n;
    String str[] ; // declaring the array of Strings

    void sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of String array ");
        n = sc.nextInt(); // getting the size of the array from user input
        str = new String[n]; // initializing the size of the array
        for (int i = 0; i < n; i++) {
            System.out.println("enter the string:");
            str[i] = sc.next(); // getting each string from user input and storing it in the array

        }
        Arrays.sort(str); // sorting the array of strings in alphabetical order
        System.out.print("sorted String array  is\n[ ");
        for (String i : str) { // printing each element of the sorted array
            System.out.print(i + "\t");
        }
        System.out.print("]");

    }

    public static void main(String args[]) {
        Sort_string s1 = new Sort_string(); // creating an object of the class Sort_string
        s1.sort(); // calling the sort() method to sort and print the array of strings
    }
}
