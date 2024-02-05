class rectangle{
	double l,b;
	
	void setData(double length,double breadth){
	l=length;
	b=breadth;
	}
	
	double getArea(){
	return l*b;
	}
	
	public static void main(String[] args){					
	rectangle r=new rectangle();
	r.setData(12.38,13);
	System.out.println("Area of the rectangle is:"+r.getArea());
	}
}
