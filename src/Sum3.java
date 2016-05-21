import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        if(nums==null || nums.length<3) return ret; 
        
        Arrays.sort(nums);
        
        int length = nums.length;
        for(int i=0; i<length-2; i++){
        	if(i>0 && nums[i]==nums[i-1]) continue;
        	int l = i+1, r = length-1;
        	while(l<r){
        		if(nums[l]+nums[r]+nums[i]==target){
        			List<Integer> ans = new ArrayList<Integer>();
        			ans.add(nums[i]);
        			ans.add(nums[l]);
        			ans.add(nums[r]);
        			ret.add(ans);
        			while(l<r && nums[l]==nums[l+1]) l++;
        			while(l<r && nums[r]==nums[r-1]) r--;
        			l++; r--;
        		} 
        		else if(nums[l]+nums[r]+nums[i]<0)
        			l++;
        		else 
        			r--;
        	}
        }
        return ret;
	} 
}
