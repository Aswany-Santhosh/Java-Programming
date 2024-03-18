import java.util.Scanner;

class Search {
 	public static void main(String[] args){
 	Scanner scanner=new Scanner(System.in);
 	System.out.println("Enter the number of elements:");
 	int n=scanner.nextInt();
 	int[] ar=new int[n];
 	int flag=0;
 	System.out.println("Enter the elements:");
 	for(int i=0;i<n;i++){
 	ar[i]=scanner.nextInt();
 	}
 	
 	System.out.println("Enter the element to be searched:");
 	int e=scanner.nextInt();
 	for(int i=0;i<n;i++){
 	if(ar[i]==e){
 	flag++;
 	break;
 	}
 	}
 	
 	if(flag!=0){
 	System.out.println(e+ " is found!!");
 	}
 	else
 	{
 	System.out.println(e+ " is not found!!");
 	}
	scanner.close();
	}
}

