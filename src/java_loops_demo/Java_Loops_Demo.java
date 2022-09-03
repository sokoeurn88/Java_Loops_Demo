package java_loops_demo;

public class Java_Loops_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =35;
		while(age<=34) {
			System.out.println("Your was born started in :"+ age);
			age++;
		}
		
		//do while loop
		do {
			System.out.println("Sokoeurn Chhay");
			age++;
		} while(age == 34);
		
	
		int i = 1;
		do {
			System.out.println(i);
//			i=i+2;
			i+=2;
		} while(i<=10);
	
		// for loop, for(initialization;condition;incre/dec){statement}
		for(int j=0;j<=10;j++) {
			System.out.println(j);
		}
		
		for(int k=10;k>=0;k--) {
			System.out.println(k);
		}
		
		//break;
		for(int l=0;l<=10;l++) {
			if(l==7) {
				break;
			}
			
			System.out.println(l);
		}
		
		for(int m=10;m>=0;m--) {
			if(m==5) {
				break;
			}
			System.out.println(m);
		}
		
		//continue
		for(int o=0;o<=10;o++) {
			if(o==5) {
				continue;
			}
			System.out.println(o);
		}
		
		for(int p=10;p>=0;p--) {
			if(p==6) {
				continue;
			}
			System.out.println(p);
		}
		
		int q = 10;
		int r = 20;
		int s;
		s=q;
		q=r;
		r=s;
		System.out.println(q);
		System.out.println(r);
		
		int x = 50;
		int y = 100;
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);
		
		
		//odd or evenNumber
		int w = 21;
		if (w%2==0) {
			System.out.println("it is even");
		} else {
			System.out.println("it is odd number");
		}
		
		//find largest number
		int t = 100;
		int u = 200;
		int v = 300;
		if((t>u) && (t>v)) {
			System.out.println("t is the largest number");
		} else if((u>t) && (u>v)) {
			System.out.println("u is the largest number");
		} else {
			System.out.println("v is the largest number");
		}
	
	}

}
