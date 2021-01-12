
package marksheet;

import java.util.Scanner;


public class MarkSheet {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);     
      
        System.out.println("Enter your Name");
        String name = s.next();
        System.out.println("Enter your Father name");
        String fname = s.next();
        System.out.println("Enter your Address");
        String add = s.next();
        System.out.println("Enter your Biology Marks");
        int bio = s.nextInt();
        System.out.println("Enter your Chemistry Marks");
        int chem = s.nextInt();
        System.out.println("Enter your Physics Marks");
        int phy = s.nextInt();
        System.out.println("Enter your Mathematics Marks");
        int math = s.nextInt();
        System.out.println("Enter your urdu Marks");
        int urdu = s.nextInt();
        System.out.println("Enter your English Marks");
        int eng = s.nextInt();
        System.out.println("Name = " +name);
        System.out.println("Age = " +fname);
        System.out.println("Address = " +add);
        System.out.println("Biology = " +bio);
        System.out.println("Chemistry = " +chem);
        System.out.println("Physics = " +phy);
        System.out.println("Mathematics = " +math);
        System.out.println("Urdu = " +urdu);
        System.out.println("English = " +eng);
        int tm = 600;
        int Om = bio+chem+phy+math+urdu+eng;
        int per = Om*100/tm;
        System.out.println("Total Marks are " +tm);
        System.out.println("Obtained Marks are " +Om);
        System.out.println("Percentage is " +per);
         
        if( per >= 80)
        {
            System.out.println("Your Grade is A1");
        }
        else if( per >= 70 )
        {
            System.out.println("Your Grade is A");
        }
        else if( per >= 60)
        {
            System.out.println("Your Grade is B");
        }
        else if ( per >= 50)
        {
            System.out.println("Your Grade is C");
        }
        else
        {
            System.out.println("You are Fail");
        }
    }
}