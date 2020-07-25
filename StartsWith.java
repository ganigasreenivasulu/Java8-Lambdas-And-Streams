import java.util.*;

public class StartsWith{
public static void main(String args[]){

Scanner s = new Scanner(System.in);

String[] st = s.nextLine().split(" ");
List<String> lis = new ArrayList<>();
for(String e:st){
lis.add(e);
}
System.out.println(letter(lis));
}

public static List<String> letter(List<String> lis){
   List<String> res = new ArrayList<>();
    for(String s:lis){
     if(s.charAt(0) == 'a' && s.length() == 3){
     res.add(s);
     }
    }
return res;
}

}