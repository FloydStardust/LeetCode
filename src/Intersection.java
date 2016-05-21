import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i : nums1){
			if(temp.contains(i))
				continue;
			for(int j : nums2){
				if(i==j){
					temp.add(i);
					break;
				}
			}
		}
		int[] result = new int[temp.size()];
		for(int i=0; i<temp.size(); i++)
			result[i] = temp.get(i);
		return result;
	}
	
	// 用Map分别记录两个数组各个数字出现的次数，选择次数较小的填充
	public int[] intersectionII(int[] nums1, int[] nums2) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(int temp1 : nums1){
			if(map1.containsKey(temp1))
				map1.put(temp1, map1.get(temp1)+1);
			else 
				map1.put(temp1, 1);
		}
		for(int temp2 : nums2){
			if(map2.containsKey(temp2))
				map2.put(temp2, map2.get(temp2)+1);
			else 
				map2.put(temp2, 1);
		}
		for(Map.Entry<Integer, Integer> entry : map1.entrySet()){
			int key = entry.getKey();
			if(map2.containsKey(key)){ 
				int times = map1.get(key) > map2.get(key) ? map2.get(key) : map1.get(key);
				for(int i=0; i<times; i++)
					temp.add(key);
			}
		}
		int[] result = new int[temp.size()];
		for(int i=0; i<temp.size(); i++)
			result[i] = temp.get(i);
		return result;
	}
}
