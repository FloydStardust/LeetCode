
public class Sum2 {
	public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums==null || nums.length<2 ) return ret;
        for(int i=0; i<nums.length-1; i++){
        	for(int j=i+1; j<nums.length; j++){
        		if(nums[i]+nums[j]==target){
        			ret[0]=i; ret[1]=j;
        		}
        	}
        }
        return ret;
    }
}
