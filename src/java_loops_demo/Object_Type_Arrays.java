package java_loops_demo;

public class Object_Type_Arrays {

	public static void main(String[] args) {
		// Object Array can store all data types, size is limited 5
		Object a[]= new Object[5];
		a[0]="sokoeurn chhay";
		a[1]= 34;
		a[2]="He is living in USA";
		a[3]=200.50;
		a[4]=true;
		for(Object i:a) {
			System.out.println(i);
		}
		
		// Object Array is not limited in size
		Object b[]= {2022,"Dallas, TX", 34, "sokoeurn chhay", 200.20, 5.7, true};
		for(Object i:b) {
			System.out.println(i);
		}
		
		//there are 2 types of arrays
		//Single dimensional array: int a[]=new int[5];
		//Two dimensional array/multi dimensional array: int a[][] = new int[3][2];
		
	}

}
