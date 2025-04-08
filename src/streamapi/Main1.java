package streamapi;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "employee name" + name;
    }

}

public class Main1{

    public static void main(String[] args) {
        List<A> employees= Arrays.asList(
                new A("Ashwini"),
                new A("arun")
        );
        List<A> filtered=employees.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());

        for(A emp:filtered){
            System.out.println(emp);

        }


    }

}

