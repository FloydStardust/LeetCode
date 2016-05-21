
public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0]) return false;
        int m = matrix[0].length;
        for(int i=0; i<matrix.length ; i++){
        	if( target>=matrix[i][0] && target<=matrix[i][m-1]){
        		for(int j=0; j<m; j++){
        			if(target==matrix[i][j])
        				return true;
        		}
        	}
        }
		return false;
    }
	
	public boolean searchMatrixII(int[][] matrix, int target){
		return false;
	}
}
