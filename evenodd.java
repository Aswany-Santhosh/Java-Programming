import java.util.Scanner;
class evenodd{

	public static void main(String[] args){
	int n;					
	Scanner scanner=new Scanner(System.in);
	System.out.print(" Enter a number:");
	n=scanner.nextInt();
	if(n%2==0)
	{
	System.out.println(n+" is even.");
	}
	else
	{
	System.out.println(n+" is odd.");
	}
	scanner.close();
	}
}
