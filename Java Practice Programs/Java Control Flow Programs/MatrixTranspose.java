
public class MatrixTranspose {

	public static void main(String[] args) {
		int myArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//findTransposeOfMatrix(myArray);
		sumOfDiagonalMatrix(myArray);

	}
	
	static void findTransposeOfMatrix(int[][] myArray) {
		int tranpose[][] = new int[3][3];
		
		System.out.println("The matrix before transpose is: ");
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				tranpose[i][j] = myArray[j][i];
			}
			System.out.println();
		}
		
		System.out.println("The matrix after applying transpose is: ");
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(tranpose[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	static void sumOfDiagonalMatrix(int[][] myArray) {
		//Find sum of diagonal elements in the Matrix
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==j) { // Main logic
					sum += myArray[i][j];
				}
			}
		}
		System.out.println("The sum of diagonal elements is: "+sum);


	}
}
