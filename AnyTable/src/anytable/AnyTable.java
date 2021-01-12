
package anytable;

import java.util.Scanner;

public class AnyTable {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter your Table No");
        int table = s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(table+ "*" +i+ "=" +i*table);
        }
            
    }
    
}
