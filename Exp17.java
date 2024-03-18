import java.util.Scanner;
class Employee {
    int empID;
    String Name;
    double Salary;
    String Address;

    public Employee(int empID, String Name, double Salary,String Address) {
        this.empID = empID;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends employee {
	    String Dept;
	    String[] SubTaught;
public Employee(int empID, String Name, double Salary,String Address,String Dept, String[] SubTaught) {
        super(empID,Name,Salary,Address);
        this.Dept = Dept;
        this.SubTaught = SubTaught;
        }
       }
       
       void display(){
       System.out.println("Employee ID:"+ empID);
       System.out.println("Employee Name:"+ Name);
       System.out.println("Salary:"+ Salary);
       System.out.println("Address:"+ Address);
       System.out.println("Department:"+ Dept);
       System.out.println("Subjects:"+ Subjects);
       System.out.println("Subjects Taught:"+ SubTaught);
       for(String subjects : subjectsTaught){
       System.out.println("Employee ID:");
       }
       }
       
public class Exp17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        
        Teacher[] teacher = new Teacher[n];
        }
        }
