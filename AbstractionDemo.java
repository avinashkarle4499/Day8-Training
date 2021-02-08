package day8;

abstract class operation
{
	abstract void numbers (int a,int b);
	void display ()
	{
		System.out.println("this is normal method");
	}
}

class Sachin extends operation
{

	@Override

	void numbers (int a, int b)
	{
		System.out.println(a-b);

	}
}
class Rahul extends operation
{
	@Override
	void numbers(int a, int b)
	{
		System.out.println(a-b);

	}
}




public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sachin a= new Sachin ();
		a.numbers(3, 4);
		a.display();

		Rahul b= new Rahul();
		b.numbers(4, 1);
		b.display();


	}

}