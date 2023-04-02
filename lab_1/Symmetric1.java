// import org.apache.commons.math3.linear.*;
// import org.apache.commons.math3.linear.*;
import java.util.*;
class Symmetric1
{
    public static void main(String args[])
    {
    int row,col;
int  [] []arr;
Boolean isSymmetric =true;
    Scanner sc = new Scanner(System.in);


    System.out.println("enter the size of row");
    row = sc.nextInt();
    System.out.println("enter the size of column:");
    col = sc.nextInt();
    arr  =new  int [row][col];
    System.out.println("enter the element of matrix:");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
if (row != col)
{
    isSymmetric=false;
}
else{
    for (int i = 0; i < row; i++) {
        for(int j=0;j<col;j++)
        {
            if(arr[i][j]!=arr[j][i])
            {
                isSymmetric=false;
                break;
            }

        }
        
    }
}
if (isSymmetric)
{
System.out.println("matrix is symmetric");
}
else
{
    System.out.println("matrix is not symmetric");
}
}
}
