
public class MostWater {
	//这个解法的时间复杂度太高，超出限制
	public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++){
        	for(int j=height.length-1; j>i; j--){
        		if(j<height.length-1 && height[j]<=height[j+1]) continue;
        		int h = height[i]<height[j]?height[i]:height[j];
        		int temp = h * (j-i);
        		if(temp>max) max = temp;
        	}
        }
        return max;
    }
	
	//从两侧向中间逼近
	public int maxArea2(int[] height){
		int max = 0;
		int l = 0, r = height.length-1;
		while(l<r){
			max = Math.max(max, (Math.min(height[l], height[r]))*(r-l));
//			以下写法不被支持
//			height[l]<height[r]?l++:r--;
			if (height[l] < height[r]) 
				l++;
			else 
				r--; 
		}
		return max;
	}
}
