// Count no. of space and character in given string
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner srt =new Scanner (System.in);
     String str= srt.nextLine();
     String s= str.toLowerCase(); //to convert into lower case
     int count =0;
     int count1 =0;
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)==' '){     //to compare with equal
             count++;
         }
         if(s.charAt(i)>'a' && s.charAt(i)<'z'){    //to check character from a to z
             count1++;
         }
     }
     System.out.println(count);
      System.out.println(count1);
    }
}
