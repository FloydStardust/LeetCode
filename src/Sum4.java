import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if( nums==null || nums.length<4 ) return ret;
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-3; i++){
			if(i>0 && nums[i]==nums[i-1]) continue;
			for(int j=nums.length-1; j>i+2; j--){
				if(j<nums.length-1 && nums[j]==nums[j+1]) continue;
				int l=i+1, r=j-1;
				while(l<r)
					if(nums[i]+nums[j]+nums[l]+nums[r]==target){
						if(nums[i]==nums[j] && nums[j]==nums[l]) continue;
						List<Integer> ans = new ArrayList<Integer>();
						ans.add(nums[i]);
						ans.add(nums[l]);
						ans.add(nums[r]);
						ans.add(nums[j]);
						ret.add(ans);
						while( l<r && nums[l]==nums[l+1]) l++;
						while( l<r && nums[r]==nums[r-1]) r--;
						l++; r--;
					}
					else if(nums[i]+nums[j]+nums[l]+nums[r]<0){
						l++;
					} else {
						r--;
					}
			}
		}
		return ret;
    }
}
