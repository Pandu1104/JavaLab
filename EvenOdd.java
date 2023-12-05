//even or odd
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        System.out.print("Enter a number: ");
        Scanner reader=new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        if(num%2==0)
        {
            System.out.print("\nEntered number"+num+"is an even number.");
        }
        else
        {
            System.out.print("\nEntered number"+num+"is an odd number.");
        }
        
        
        
    }
}
