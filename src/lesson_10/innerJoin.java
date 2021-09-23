package lesson_10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class innerJoin {

    public static void main(String[] args) throws Exception{
        List<Employee> employees =readEmployee("C:/JavaArt/aivanishyn/src/employees.csv");
        List<Department> departments=readDepartment("C:/JavaArt/aivanishyn/src/departments.csv");
        System.out.println(departments);
        System.out.println(employees);
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
        Employee result = new Employee(Integer.parseInt(arr2[0]),(arr2[1]),(arr2[2]),(arr2[3]));
        return result;
    }


}
