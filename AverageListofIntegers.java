
import java.util.*; 
  
public class AverageListofIntegers { 

public static void main(String args[]){

Scanner s = new Scanner(System.in);

String[] st = s.nextLine().split(" ");
List<Integer> lis = new ArrayList<>();
for(int i = 0;i<st.length;i++){
lis.add(Integer.parseInt(st[i]));
}
System.out.println(average(lis));
}

    public static double average(List<Integer> lis){
      int sum = 0;
      for(int e:lis){
       sum += e;
      }
     return sum/lis.size();
}
    
} 