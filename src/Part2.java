import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This program reads a hexadecimal number input by the user and prints the 
 * base-10 equivalent.  If the input contains characters that are not 
 * hexadecimal numbers, then an error message is printed.
 */

public class Part2 {
 public static void main(String[] args) {
    boolean Continued = false;
   do {
      try {
         String regex = "[0-9A-F]";
         String input;
         Scanner scanner = new Scanner(System.in);
         System.out.println("ENTER STRING: " );
         input = scanner.nextLine();
         Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
         Matcher matcher = pattern.matcher(input);
         if(matcher.find()) {
            
         }
      } catch (Exception e) {
         //TODO: handle exception
      }
   } while (Continued);
 }

}
