public class CountingBits {

	public int[] conutBits(int num) {
		// TODO Auto-generated method stub
		int[] result = new int[num+1]; 
		
		for(int i=1;i<=num;i++){
			if(i%2!=0)
				result[i] = result[i/2]+1;
			else
				result[i] = result[i/2];
		}
		return result;
	}

}
