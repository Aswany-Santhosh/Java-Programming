import java.util.Arrays;
import java.util.Scanner;

public class Stringsort{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of Strings:");
	int nos=scanner.nextInt();
	scanner.nextLine();
	String[] strings=new String[nos];
	
	for(int i=0;i<nos;i++){
		strings[i]=scanner.nextLine();
		}
	Arrays.sort(strings);
	System.out.println("\nSorted strings:");
	for(String str:strings){
	System.out.println(str);
	}
	scanner.close();
	}
}
	
	
