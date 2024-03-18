import java.util.Scanner;
public class StudentMarks{
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of subjects:");
	int numsubjects=scanner.nextInt();
	
	int[] marks=new int[numsubjects];
	int total=0;
	float percentage;
	
		System.out.println("Enter the marks of each subject:");
		for(int i=0;i<numsubjects;i++){
		marks[i]=scanner.nextInt();
		}
		
		for(int i=0;i<numsubjects;i++){
		total=total+marks[i];
		}
		
		percentage=(total/(float) (numsubjects*100))*100;
		
		System.out.println("Total marks:" + total);
		System.out.println("Percentage:" + total/numsubjects);
	}
	}
	
