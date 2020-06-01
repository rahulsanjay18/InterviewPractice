
public class MatrixMult {
	public static int[][] matrix_multiply(Matrix A, Matrix B){
		Matrix C = new Matrix(A.getNum_rows(), B.getNum_cols());
		
		for(int i = 0; i < A.getNum_rows(); i++) {
			for(int j = 0; j < A.getNum_cols(); j++) {
				C.setValue(i, j, 0);
				for(int k = 0; k < B.getNum_cols(); k++) {
					C.setValue(i, j, C.getValue(i, j) + A.getValue(i, k) * B.getValue(k, j));
				}
			}
		}
		
		return C.getMatrix();
	}
}
