
package array_practice;

import java.util.Scanner;

public class Array_practice {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      
        System.out.println("Enter your Arrray Lenght");
        int len=s.nextInt();
        int arr[]= new int[len];
        
        for(int i=0;i<arr.length;i++)
        {
        
            System.out.println("Enter array Lenght no is : arr[" + i + "]");
            arr[i] =s.nextInt();
            
        }
        for(int i=0;i<arr.length;i++)
        {
        
            System.out.println("Earray vakue is : arr[" + i + "] = " + arr[i]);
            
        }
             
        
      
    }
    
}
