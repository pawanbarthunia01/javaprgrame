import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {

      List<String>  unsortedNumber=Stream.of("10","20","101","110","30","40").collect(Collectors.toList());
      List<String> numbers=Stream.of("10","20","101","110","30","40")
      .filter(str->str.startsWith("1")).collect(Collectors.toList());
      
      List<String> sortedList=numbers.stream().sorted((str1,str2)->str1.compareTo(str2)).collect(Collectors.toList());
      List<String> unSortToSortAllList=unsortedNumber.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
      List<String> unSortToSortAllList1=unsortedNumber.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
      
      System.out.println("Intial");
      System.out.println("This is jenkins first project"+numbers+"\n"+unSortToSortAllList+"\n"+unSortToSortAllList1);
    }
}