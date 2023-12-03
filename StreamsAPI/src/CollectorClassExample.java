import java.util.*;
import java.util.stream.*;
public class CollectorClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(34);
        // static to collection method
        ArrayList<Integer> l1= al.stream().collect(Collectors.toCollection(()->new ArrayList<Integer>()));
        System.out.println(l1);
        List<Integer> l2= al.stream().collect(Collectors.toList());
        List<Integer> l3= al.stream().collect(Collectors.toList());
     //   ArrayList<Integer> l4=al.stream().collect(Collectors.toList()); so this is error
ArrayList<String> al2=new ArrayList<String>();
al2.add("shivam");
al2.add("shubhank");
        System.out.println(al2.stream().collect(Collectors.joining()));// joining method that concatanates input parameters into the string

    }
}
