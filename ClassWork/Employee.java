import java.util.Scanner;

class Employee1 {
    private static int counter=101;
    private String name;
    private int id;
    private int salary;
    public Employee1(){
        id= counter;
        counter++;
    }
    public void insertValue(String name,int salary){
          this.name=name;
          this.salary=salary;
    }
    public void display(){
        System.out.println("id"+id);
        System.out.println("name"+name);
        System.out.println("salary"+salary);
    }
    public static Employee1 searchEmp(Employee1[] emps, int id){
         for(Employee1 emp : emps){
            if(emp.id==id){
                return emp;
            }
         }
         return null;
    }
}
public class Employee{
    public static void main(String[] args) {
        Employee1 e=new Employee1();
        e.insertValue("Paridhi",20000000);
        e.insertValue("Paridhi",20000000);
        e.display();
        Employee1[] emps=new Employee1[10];
        System.out.println("enter id");
        Scanner sc= new Scanner(System.in);
        // ID=sc.nextInt();
        for(Employee1 emp:emps){
            emp.insertValue("xyz", 70000);
        }
Employee1 emp =Employee1.searchEmp(emps,5);
emp.display();
    }
}
