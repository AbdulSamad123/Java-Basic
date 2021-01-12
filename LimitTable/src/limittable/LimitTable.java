
package limittable;

import java.util.Scanner;

public class LimitTable {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int Start=0;
       int End=0;
        System.out.println("Enter your Table No");
        int table = s.nextInt();
        System.out.println("Enter your Start Number");
        Start = s.nextInt();
        System.out.println("Enter your End Number");
        End = s.nextInt();
       for (int i=Start ; i<=End ; i++ )
       {
           System.out.println(table+ "*" +i+ "=" +i*table);
       }
    }
    
}
