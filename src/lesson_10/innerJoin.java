package lesson_10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class innerJoin {

    public static void main(String[] args) throws Exception{
        List<Employee> employees =readEmployee("D:/JavaProjects/Hillel/java-elementary/resources/lesson10res/employees.csv");
        List<Department> departments=readDepartment("D:/JavaProjects/Hillel/java-elementary/resources/lesson10res/departments.csv");
        System.out.println(departments);
        System.out.println(employees);

        Map<Integer,String> depNames = new HashMap<>();
        departments.forEach(x->depNames.put(x.getId(),x.getDepartment()));
        System.out.println(depNames);

        employees.stream().filter(x->depNames.get(x.getDepartmentId())!= null).forEach(x->{
            System.out.println(x.getName() +  " " + x.getSurname() + " " + depNames.get(x.getDepartmentId()));
        });
    }

    static List<Employee> readEmployee(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner sc = new Scanner(path);
        List<Employee> result = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNext()){
            String str = sc.next();
            result.add(convertToEmployee(str));
        }
        return result;
    }

    static List<Department> readDepartment(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner sc = new Scanner(path);
        List<Department>result = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNext()){
            String str = sc.next();
            result.add(convertToDepartments(str));
        }
        return result;
    }

    static Department convertToDepartments(String str){
        String[] arr = str.split(";");
        Department result = new Department(Integer.parseInt(arr[0]),(arr[1]));
        return result;
    }

    static Employee convertToEmployee(String str2){
        String[] arr2 = str2.split(";");
        Employee result = new Employee(Integer.parseInt(arr2[0]),(arr2[1]),(arr2[2]),Integer.parseInt(arr2[3]));
        return result;
    }


}
