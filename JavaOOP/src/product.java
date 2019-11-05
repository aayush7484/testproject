class mobile{
	
    //attributes(state)
	int id;
	String name;
	int price;
	
	//constructors
	mobile(){
		System.out.println("mobile object constructed");
	}
	
	//methods(behaviors)
	void getmobiledetails(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	void showmobiledetails() {
		System.out.println("------id------"+id);
		System.out.println("Name:" +name);
		System.out.println("Price:"+price);
		System.out.println("-------------------");
	}
}



public class product {
	public static void main(String[] args) {
		//create an object
		mobile a=new mobile();
		a.getmobiledetails(101,"One Plus",32999);
		a.showmobiledetails();
		
		mobile b=new mobile();
		b.id=102;
		b.name="One plus 7 pro";
		b.price=52999;
		b.showmobiledetails();
		
	}

}
