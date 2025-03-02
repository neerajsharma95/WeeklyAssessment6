import java.io.*;
import java.util.*;
interface StringConcat {

    public String sconcat(String a, String b);
}
class Example {

   public static void main(String args[]) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
    	StringConcat s = (str1, str2) -> str1 +" "+ str2;
        System.out.println(s.sconcat(s1, s2));
    }
}

