
public class TrapRain {

	//额，这个算法的时间复杂度又太高了
	 public int trap(int[] height) {
	    int rain = 0;
	    for(int i=0; i<height.length; i++){
	    	for(int j=i+1; j<height.length; j++){
	    		if(height[j]==height[j-1] ||height[j]<height[i]) continue;
	    		int total = Math.min(height[j],height[i]) * (j-i-1);
	    		int black = 0;
	    		for(int temp=i+1; temp<j; temp++){
	    			black += height[temp];
	    		}
	    		rain += (total-black);
	    		i=j-1;
	    		break;
	    	}
	    }
	    return rain;
	 }
	 
	 //这个方法太棒了！注意移动的是第二高的点temp
	 public int trap2(int[] height){
		 int rain=0;
		 int l = 0, r = height.length-1;
		 int temp = 0;
		 while(l<r){
			 if(height[l]<height[r]){
				 temp = Math.max(height[l], temp);
				 rain += temp - height[l];
				 l++;
			 } else {
				 temp = Math.max(height[r], temp);
				 rain += temp - height[r];
				 r--;
			 }
		 }
		 return rain;
	 }
}
