public class Matrix {
	private int[][] matrix;
	private int num_rows;
	private int num_cols;
	
	
	public Matrix(int[] lst, int rows, int cols) {
		this(rows, cols);
		
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = lst[rows * i + j];
			}
		}
		
	}

	public Matrix(int rows, int cols) {
		num_rows = rows;
		num_cols = cols;
		
		matrix = new int[rows][cols];
	}
	
	public Matrix(int dim) {
		this(dim, dim);
	}
	
	public Matrix(int[] lst, int dim) {
		this(lst, dim, dim);
	}
	
	public Matrix(int[][] lst) {
		this(lst.length, lst[0].length);
		
		for(int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst[0].length; j++) {
				matrix[i][j] = lst[i][j];
			}
		}
		
	}
	
	public void setValue(int i, int j, int val) {
		this.matrix[i][j] = val;
	}
	
	public int getValue(int i, int j) {
		return this.matrix[i][j];
	}
	
	public int[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	public int getNum_rows() {
		return num_rows;
	}
	public void setNum_rows(int num_rows) {
		this.num_rows = num_rows;
	}
	public int getNum_cols() {
		return num_cols;
	}
	public void setNum_cols(int num_cols) {
		this.num_cols = num_cols;
	}
}
