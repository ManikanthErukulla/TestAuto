public class Employee {
	String Name;
	int Year_of_joining;
	String Address;
	
	public Employee()
	{
		System.out.println("Name"+"\t\t"+"Year of joining"+"\t\t"+"Address");
	}
	public Employee (String Name, int Year_of_joining, String Address )
	{
		this.Name = Name;
		this.Year_of_joining = Year_of_joining;
		this.Address = Address;
		print();
	}
	public void print()
	{
		System.out.println(Name+"\t\t"+Year_of_joining+"\t\t\t"+Address);
	}
	
	public static void main(String[] args) {
				
		Employee E1 = new Employee();
		Employee E2 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee E3 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee E4 = new Employee("John",1999,"26B- WallsStreat");
	}
}
