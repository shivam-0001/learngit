import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.*;
public class StreamExample {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> l1 = al.stream().map(i -> i * i).collect(Collectors.toList());
        List<Integer> l2 = al.stream().sorted().collect(Collectors.toList());
        System.out.println("for filter" + " " + l);
        System.out.println("for map=" + l1);
        System.out.println("for sorted in ascending order" + l2);
        List<Integer> l3 = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("for sorted in descending order" + l3);
        long l6 = al.stream().count();
        System.out.println("for no of elements" + " " + l6);
        int k = al.stream().reduce(0, (i1, i2) -> (i1 + i2));
        System.out.println(k);
        IntStream s = al.stream().mapToInt((i) -> i * i);
        s.boxed().forEach((a) -> System.out.println(a));
        System.out.println(al.stream().collect(Collectors.counting()));
        Optional<Integer> o = al.stream().collect(Collectors.minBy((i1, i2) -> i1.compareTo(i2)));
        System.out.println("The length is=" + o.get());

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("five");
        al1.add("four");
        al1.add("four");
        Map<Integer, Set<String>> m2 = al1.stream().collect(Collectors.groupingBy(s1 -> s1.length(), Collectors.toSet()));
        System.out.println(m2);
        Map<Integer, String> m3 = al1.stream().collect(Collectors.toMap(s4 -> s4.length(), s3 -> s3, (oldvalue, newvalue) -> newvalue + " " + oldvalue));
        System.out.println(m3);
        String str = "insight geeks java developers";
        char arr[] = str.toCharArray();
        ArrayList<Character> al5 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            al5.add(str.charAt(i));
        }
        System.out.println(al5.stream().collect(Collectors.toMap(i -> i, i -> 1, (a, b) -> a + b)).entrySet().stream().max((i6, i7) -> i6.getValue().compareTo(i7.getValue())).get());


        Employee e = new Employee(1, "shivam", "Agrawal", "bulandshahr", "InsightGeeks");
        Employee e1 = new Employee(1, "shivam", "Agrawal", "bulandshahr", "TCS");
        Employee e2 = new Employee(2, "shubhank", "sharma", "bulandshahr", "InsightGeeks");
        Employee e3 = new Employee(3, "harish", "Agrawal", "bulandshahr", "TCS");
        Employee e4 = new Employee(4, "shreyash", "sharma", "bulandshahr", "IJ");

        ArrayList<Employee> al4 = new ArrayList<>();
        al4.add(e);
        al4.add(e1);
        al4.add(e2);
        al4.add(e3);
        al4.add(e4);
        Map<String, List<Employee>> w = al4.stream().collect(Collectors.groupingBy(e6 -> e6.companyname));
        System.out.println(w);
        //Helpful function to reading
        w.forEach((s5, q) ->
        {
            // List<Employee>employees=q;
            q.forEach((w2) -> {
                System.out.println(s5 + " " + w2.getName());
//                    Employee employee=w2;
//                System.out.println(employee.city);
//                String v=employee.city+"mycity";
            });


        });


        ArrayList<Integer> q1 = new ArrayList<>();
        q1.add(101);
        q1.add(100);
        q1.add(110);
        q1.add(200);
        q1.add(210);
        q1.stream().filter((w1) ->
        {
            String s1 = w1.toString();
            if (s1.charAt(0) == '1') {
                return true;
            } else {
                return false;
            }
        }).forEach(q -> System.out.println(q));
        String str1 = "insight geeks java developers";
        char arr1[] = str1.toCharArray();
        ArrayList<Character> s3 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            s3.add(str1.charAt(i));
        }
        System.out.println(s3.stream().collect(Collectors.toMap(a->a,a->1,(oldvalue,newvalue)->oldvalue+newvalue)).entrySet().stream().max((i1,i2)->i1.getValue().compareTo(i2.getValue())).get());
    String str3="shubhank";
    ArrayList<Character> al9=new ArrayList<>();
        for (int i = str.length(); i < str3.length(); i++) {
            al9.add(str.charAt(i));
        }
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"shivam");
        m.put(2,"shubhank");
        m.put(3,"harish");
        m.put(4,"kunal");
       Set  v= m.entrySet();
       Iterator itr=v.iterator();
       while (itr.hasNext())
       {
        Map.Entry<Integer,String> k2=   (Map.Entry)itr.next();
           System.out.println(k2.getKey()+" "+k2.getValue());

       }
       String r="shivam";
       r.concat("sdhdh");
        System.out.println(r);



    }

}