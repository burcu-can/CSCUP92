// Contains many syntax errors...  

import java.util.Scanner;  

public class InputLoop  
{  
    public static void main (String() args);  
    {  
        Scanner scan = new Scanner(System.in)  
        System.out.printLn ("Enter an integer");  
        while (!scan.hasNextInt()) // while non-integers are present...  
        {  
            Scan.next();           //...read and discard input, then prompt again  
            System out println ("Bad input. Enter an integer");   
        }  
        int input = scan.nextInt();       
        System.out.print1n ("You entered ", input, "!");  
    }  
}
