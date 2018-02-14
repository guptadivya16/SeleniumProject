package RajeshAssignment;

public class SingletonUsingEnum {
	
	public static void main(String a[])
	{

		SingleTonDemo obj1 = SingleTonDemo.INSTANCE;
		System.out.println(obj1);
		obj1.i= 5;
		obj1.show();
		
		SingleTonDemo obj2 = SingleTonDemo.INSTANCE;
		obj1.i= 6;
		obj1.show();
	}
}
enum SingleTonDemo{
	
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
	
	
}
