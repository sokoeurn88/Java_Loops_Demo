package oops_demo;

public class Oops_Demo {
	
	String empname;
	int empage;
	int empid;
	String empdep;
	
	// create constructor of the class, never return any values-=
	Oops_Demo (String name, int age, int id, String dep){
		empname = name;
		empage = age;
		empid = id;
		empdep = dep;
				
	}
	
	public void empDisplay() {
		System.out.println(empname);
		System.out.println(empage);
		System.out.println(empid);
		System.out.println(empdep);
	}
	
	
	public static void main(String[] args){
		Oops_Demo emp1 = new Oops_Demo("sokoeurn chhay", 34, 007, "Quality Control");
		emp1.empDisplay();
	}

}
