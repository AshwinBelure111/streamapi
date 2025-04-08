package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class GroupbyDepartment {
    private int id;
    private String name;
    private String department;

    //constructor
    public GroupbyDepartment (int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;

    }
    //getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    @Override
    public String toString(){
        return id+" - "+name;
    }
}

public class Main2{
    public static void main(String[] args){
        List<GroupbyDepartment> employee= Arrays.asList(
                new GroupbyDepartment(1,"Alice","HR"),
                new GroupbyDepartment(2,"Arun","It"),
                new GroupbyDepartment(3,"Ashwini","HR")
                );
        Map<String,List< GroupbyDepartment> > employees=employee.stream().collect(Collectors.groupingBy(GroupbyDepartment::getDepartment));
        System.out.println(employees);
        //Ashwini
        //Amit

        //ashwini belure

        //ashwini belure 12

        //origin
//        employeesByDept.forEach((dept, emps) -> {
//            System.out.println("Department: " + dept);
//            emps.forEach(System.out::println);
//        });

    }

}
