import java.util.Scanner;
import java.util.*;

public class ListofPalindromes{
public static void main(String args[]){

Scanner s = new Scanner(System.in);

String[] st = s.nextLine().split(" ");
List<String> lis = new ArrayList<>();
for(String e:st){
lis.add(e);
}
System.out.println(palin(lis));
}

public static List<String> palin(List<String> lis){
   List<String> res = new ArrayList<>();
    for(String s:lis){
     String str = new StringBuilder(s).reverse().toString();
     if(s.equals(str)){
     res.add(s);
     }
    }
return res;
}

}