package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    @Override

    public String toString() {
        return "Employee { name='" + name + "'}";
    }

}
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Ankit"),
                new Employee("Charlie"),
                new Employee("Arjun")
        );

        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with 'A':");
//filteredEmployees.forEach(System.out::println);
        // Using for loop
        for (Employee emp : filteredEmployees) {
            System.out.println(emp);
        }
    }
}
