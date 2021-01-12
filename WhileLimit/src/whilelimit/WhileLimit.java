
package whilelimit;

public class WhileLimit {

    public static void main(String[] args) {
      int start = 4;
      int end = 5;
      int table = 10;
      while(start<=end)
      {
          System.out.println(table+ "*" +start+ "=" +start*table);
          start++;
      }
    }
    
}
