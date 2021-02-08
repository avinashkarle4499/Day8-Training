package day8;

interface Employee
{
	int login = 8;
	
	void designation();

}
class Manager implements Employee
{
	

	public static Manager m;

	@Override
	public void designation()
	{
		System.out.println("i manage the team for 4 clients");
		System.out.println("i work for" + "loginHours"+ "hours");
	}
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager.m = new Manager();


	}

}
