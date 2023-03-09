import java.util.ArrayList;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(001,"张三",5000.0));
        employees.add(new Employee(002,"李四",5500.0));
        employees.add(new Employee(003,"赵六",4000.0));
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
