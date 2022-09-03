package java_loops_demo;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// two dimensional array in form of row and column
		int a[][] = new int [3][2];
		a[0][0]= 34;
		a[0][1]=1988;
		a[1][0]= 32;
		a[1][1]=1990;
		a[2][0]=67;
		a[2][1]= 1954;

		//for loop
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

		//for each loop
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// multidimension array, can store any size of array
		int c[][]= {{10,15,20},{25,30,35},{40,45,50}, {55,60,65},{70,75,80}};
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		//for each loop
		
		for(int i[]:c) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
