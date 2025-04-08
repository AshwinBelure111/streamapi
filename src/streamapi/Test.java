package streamapi;
import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    private String name;

    public Employee1(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "empl"+name;
    }
}

public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Employee1>employee=new ArrayList<>();

        System.out.println("how any employee do you want to enter");
        int count=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<count;i++){
            String name=sc.nextLine();
            Employee1 emp=new Employee1();
            emp.setName(name);
            employee.add(emp);
        }
        List<Employee1>filtered=employee.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("\nEmployees whose names start with 'A':");
        for (Employee1 emp : filtered) {
            System.out.println(emp);
        }

    }
}
