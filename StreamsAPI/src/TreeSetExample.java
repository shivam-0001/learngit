import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet <Employee>t=new TreeSet<Employee>();
        t.add(new Employee(1,"shivam","Agrawal","Asr","IG"));
        t.add(new Employee(2,"shiv","sharma","bsr","TCS"));
        t.add(new Employee(3,"shivamAgrawal","Agrawal","Asr","IG"));
        for (Employee e:t) {
            System.out.println(e.name+" "+e.city);
        }



    }
}
