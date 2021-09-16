package lesson_10;

public class innerJoin {
    static Department convertToDepartments(String str){
        String[] arr = str.split(";");
        Department result = new Department(Integer.parseInt(arr[0]),(arr[1]));
        return null;
    }

    static Employee convertToEmployee(String str2){
        String[] arr2 = str2.split(";");
        Employee result = new Employee(Integer.parseInt(arr2[1]),(arr2[2]),(arr2[3]));
        return null;
    }


}
