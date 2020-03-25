


public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		/* code goes here */
		int[] arrnew = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrnew[i] = arr[arr.length-1-i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = arrnew[i];
		}
		
		/*int mid = arr.length/2;
		for(int i=0;i<mid;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}*/
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		/* code goes here */
		int[] matnew = new int[mat[0].length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				matnew[j] = mat[i][j];
			}
			for(int j=0;j<mat[0].length;j++) {
				mat[i][j] = matnew[matnew.length-j-1];
			}
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		/* code goes here */
		reverseAllRows();
		for(int i=0;i<mat.length;i++) {
			int mid = mat.length/2;
			for(int j=0;i<mid;i++) {
				int[] temp = mat[j];
				mat[j] = mat[mat.length-j-1];
				mat[mat.length-j-1] = temp;
			}
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
