class test{
	int a;
	void display(){
	System.out.println(a);
	}
}
class prgm{
	public static void main(String[] args){
		test obj1= new test();
		obj1.a=10;
		test obj2= new test();
		obj2.a=20;
		obj1.display();
		obj2.display();
		}
}

