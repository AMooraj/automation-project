package java_package;

public class Object_Class {
	void add()
	{
		int a =5;
		int b=10;
		int sum =a+b;
		System.out.println(sum);
	}
	
	void subt(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	String username()
	{
		return "Alex";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_Class obj = new Object_Class();	
		obj.add();
		System.out.println(obj.username());
		obj.subt(20, 10);
		obj.subt(30, 20);

	}

}
