import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
  class Employee implements Comparable {
    int id;
    String name;
    public String Lastname;
    String city;

     public String getCompanyname() {
        return companyname;
     }

     public void setCompanyname(String companyname) {
        this.companyname = companyname;
     }

     public String companyname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }


    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(int id, String name, String lastname, String city,String companyname) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.city = city;
        this.companyname=companyname;
    }

      @Override
      public int compareTo(Object o) {
          Employee r=(Employee)o;
          if(this.name.length()<r.name.length())
          {
              return -1;
          } else if (this.name.length()>r.name.length()) {
              return +1;
          }
else {
    return 0;
          }
      }

      public static void main(String[] args)
    {


//        Employee shivam=new Employee(1,"shubhank","Agrawal","Asr");
//        Employee shubhank =new Employee(2,"shubhank","Sharma","Bsr");
//        Employee harish=new Employee(3,"harish","Agrawal","Bsr");
//        Employee vivek=new Employee(4,"vivek","Sharma","Asr");
////        List<Employee> emp= Arrays.asList(shivam,shubhank,harish,vivek);
//        Map<String, List<String>> result =  emp.stream().collect(Collectors.groupingBy(p -> p.name,
//                Collectors.mapping(employee -> employee.Lastname, Collectors.toList())));
//        System.out.println(result);
//      Map<Boolean,List<Employee>> ten= emp.stream().collect(Collectors.partitioningBy(e->e.Lastname.equalsIgnoreCase("Agrawal")));
//
//        System.out.println(ten);




    }

}
