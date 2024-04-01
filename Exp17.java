import java.util.Scanner;
class Employee {
    String empID;
    String Name;
    double Salary;
    String Address;

    public Employee(String empID, String Name, double Salary,String Address) {
        this.empID = empID;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends Employee {
	    String Dept;
	    String[] SubTaught;
	public Teacher(String empID, String Name, double Salary,String Address,String Dept, String[] SubTaught) {
        	super(empID,Name,Salary,Address);
        	this.Dept = Dept;
        	this.SubTaught = SubTaught;
        }
     		
       
       void display(){
       System.out.println("Employee ID:"+ empID);
       System.out.println("Employee Name:"+ Name);
       System.out.println("Salary:"+ Salary);
       System.out.println("Address:"+ Address);
       System.out.println("Department:"+ Dept);
       System.out.println("Subjects Taught:");
       for(String subject : SubTaught){
       System.out.println(" - " + subject);
       }
       System.out.println();
       }
}
       
public class Exp17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        
        Teacher[] teachers = new Teacher[n];
        
        for(int i=0;i<n;i++){
        System.out.println("Enter the details of the teacher" + (i+1) +":");
        System.out.println("Employee ID:");
        String empID=scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Employee Name:");
        String Name=scanner.nextLine();	
        
        System.out.println("Salary:");
        double Salary=scanner.nextDouble();
        scanner.nextLine();
                
        System.out.println("Address:");
        String Address=scanner.nextLine();
       
        System.out.println("Department:");
        String Dept=scanner.nextLine();
       
        System.out.println("Number of subjects taught:");
        int numSubjects =scanner.nextInt();
        scanner.nextLine();
       
        String[] SubTaught=new String[numSubjects];
        for(int j=0;j<numSubjects;j++){
        System.out.println("Subject" + (j+1) + ":");
        SubTaught[j]=scanner.nextLine();
        }
        
        teachers[i]=new Teacher(empID,Name,Salary,Address,Dept,SubTaught);
        
        }
        
        System.out.println("\nDetails of all teachers:");
        for(Teacher teacher:teachers){
        	teacher.display();
        }
        
        scanner.close();
        }
}
        	
        
       
