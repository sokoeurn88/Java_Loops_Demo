package java_loops_demo;

public class Arrays_In_Java_Demo {

	public static void main(String[] args) {
		// Single dimension array
		//int a = 10; can store only one value
		int a[] = new int[5];
		a[0] = 10;	//a value into array
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4]=50;
		System.out.println(a[4]);
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		
		//for each loop
		for(int i:a) {
			System.out.println(i);
		}

		//String array, size 4
		String s[]= new String[4];
		s[0]="Welcome";		//store value in the String array
		s[1]="to";
		s[2]="my";
		s[3]="training";
		System.out.println(s.length);
		//print each value
		for(String i:s) {
			System.out.println(i);
		}
		
		//dynamic size array
		int b[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		System.out.println("the length of integer array is: "+b.length);
		for(int i:b) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The all values in integer array is :"+sum);
	}

}
